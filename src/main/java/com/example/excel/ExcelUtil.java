package com.example.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelUtil {


    public static XSSFSheet getSheet(String filePath) throws Exception {
        //创建文件bai输入流对象
        InputStream is = new FileInputStream(filePath);
        //创建POI文件系统du对象
//        POIFSFileSystem ts= new POIFSFileSystem(is);
        //获取zhi文档对象
        XSSFWorkbook wb=new XSSFWorkbook(is);
        //获取工作薄
        XSSFSheet sheet = wb.getSheetAt(0);
        return sheet;
    }

    public static List<Map<Integer, String>> readExcel(List<CellRangeAddress> combineCell, XSSFSheet sheet) throws Exception {

        //声明行对dao象
        XSSFRow row =null;
        //通过循环获取每一行
        List<XSSFRow> rows = new ArrayList<>();
        for(int i = 0; sheet.getRow(i)!= null; i++){
            row=sheet.getRow(i);
            rows.add(row);
        }
        //循环获取一行的中列
        List<Map<Integer, String>> data = new ArrayList<>();
        for(int i = 0; i < rows.size(); i++){
            XSSFRow crow = rows.get(i);
            Map<Integer, String> map = new HashMap<>();
            for(int j = 0; j < crow.getLastCellNum(); j++){
                String combineCell1 = isCombineCell(combineCell, sheet.getRow(i).getCell(j), sheet);
                if(StringUtils.isNotBlank(combineCell1)){
                    String newval = combineCell1.replace("\n","");
                    String newval2 = newval.replace("（","");
                    String newval3 = newval2.replace("）","");
                    map.put(j,newval3);
                }
            }
            data.add(map);
        }
       return data;
    }

    /**
     * unusenum: 几行没用的
     * isNameRepeat: 是否excel中有重复的domain名字
     * @param data
     * @param unusenum
     * @param isNameRepeat
     * @param nameIdx
     * @return
     */
    public static List<String> convertDomain(List<Map<Integer, String>> data, int unusenum, boolean isNameRepeat, int nameIdx){
        List<String> tarList = new ArrayList<>();

        for(int i = 0; i < data.get(0).size(); i++){
            String excelProp = "@ExcelProperty(value = {";
            String mothod = "private String ";
            String lastVal = null;
            for (int j = unusenum; j < data.size(); j++){
                Map<Integer, String> integerStringMap = data.get(j);
                String val = integerStringMap.get(i);
                if(val == null || val == ""){
                    break;
                }
                excelProp = excelProp +val;
                if (j != data.size() - 1){
                    excelProp = excelProp + ",";
                }
                lastVal = val;
            }
            String name = PingYinUtil.ToPinyin(lastVal);
            if(isNameRepeat){
                String s = data.get(nameIdx).get(i);
//                int riskIdx = s.indexOf("保险");
//                if(riskIdx != -1){
//                    String subStr = s.substring(0,riskIdx);
                    String s1 = PingYinUtil.ToPinyin(s);
                    if(!name.equals(s1)){
                        name = s1 + name;
                    }
//                }
            }

            mothod = mothod + name +";";
            excelProp = excelProp + "}, index = "+i+")";
            tarList.add(excelProp);
            tarList.add(mothod);
        }
        return tarList;
    }

    /**
     * 合并单元格处理,获取合并行
     * @param sheet
     * @return List<CellRangeAddress>
     */
    public static List<CellRangeAddress> getCombineCell(XSSFSheet sheet) {
        List<CellRangeAddress> list = new ArrayList<>();
        //获得一个 sheet 中合并单元格的数量
        int sheetmergerCount = sheet.getNumMergedRegions();
        //遍历所有的合并单元格
        for(int i = 0; i<sheetmergerCount;i++)
        {
            //获得合并单元格保存进list中
            CellRangeAddress ca = sheet.getMergedRegion(i);
            list.add(ca);
        }
        return list;
    }

    /**
     * 判断单元格是否为合并单元格，是的话则将单元格的值返回
     * @param listCombineCell 存放合并单元格的list
     * @param cell 需要判断的单元格
     * @param sheet sheet
     * @return
     */
    public static String isCombineCell(List<CellRangeAddress> listCombineCell, Cell cell, XSSFSheet sheet)
            throws Exception{
        int firstC = 0;
        int lastC = 0;
        int firstR = 0;
        int lastR = 0;
        String cellValue = null;
        if(cell == null){
            return "";
        }
        for(CellRangeAddress ca:listCombineCell)
        {
            //获得合并单元格的起始行, 结束行, 起始列, 结束列
            firstC = ca.getFirstColumn();
            lastC = ca.getLastColumn();
            firstR = ca.getFirstRow();
            lastR = ca.getLastRow();
            if(cell.getRowIndex() >= firstR && cell.getRowIndex() <= lastR)
            {
                if(cell.getColumnIndex() >= firstC && cell.getColumnIndex() <= lastC)
                {
                    Row fRow = sheet.getRow(firstR);
                    Cell fCell = fRow.getCell(firstC);
                    cellValue = getCellValue(fCell);
                    break;
                }
            }
            else
            {
                cellValue = cell.getStringCellValue();
            }
        }
        return cell.getStringCellValue();
    }

    /**
     * 获取单元格的值
     * @param cell
     * @return
     */
    public static String getCellValue(Cell cell){
        if(cell == null) {
            return "";
        }
        return cell.getStringCellValue();
    }



    public static void main(String []args) throws Exception {
        String filePath = "C:\\Users\\meichai-2021\\Desktop\\模板\\供应商模板.xlsx";
//        //政策模板
//        XSSFSheet sheet = getSheet(filePath);
//        List<CellRangeAddress> combineCell = getCombineCell(sheet);
//        List<Map<Integer, String>> maps = readExcel(combineCell, sheet);
//        convertDomain(maps,152, 3,Boolean.TRUE, 0);
//        System.out.println(JSON.toJSONString(maps));

        XSSFSheet sheet = getSheet(filePath);
        List<CellRangeAddress> combineCell = getCombineCell(sheet);
        List<Map<Integer, String>> maps = readExcel(combineCell, sheet);
        List<String> dataList = convertDomain(maps, 0, Boolean.TRUE, 0);

        String targetPath = "E:\\model\\domain3.txt";


        File file = new File(targetPath);
        FileWriter writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);
        for(int i = 0; i < dataList.size(); i++){
            bw.write(dataList.get(i));
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
