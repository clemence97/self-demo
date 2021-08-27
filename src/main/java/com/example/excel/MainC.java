package com.example.excel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashSet;
import java.util.Set;

public class MainC {

    public static void main(String [] args) throws Exception {
////        String model = "C:\\Users\\meichai-2021\\Desktop\\model.xlsx";
////        String target = "C:\\Users\\meichai-2021\\Desktop\\666.xlsx";
////
////        Domain domain = new Domain();
//////        domain.setEmpfee(Double.parseDouble("2"));
//////        domain.setOrgfee(Double.parseDouble("4"));
//////        domain.setTotalfee(Double.parseDouble("6"));
////        domain.setEmpfee("2.00");
////        domain.setOrgfee("4.00");
////        domain.setTotalfee("6.00");
////
////        List<Domain> dataList = new ArrayList<>();
////        dataList.add(domain);
////        EasyExcel.write(target).registerWriteHandler(new DoubleHandler()).withTemplate(model).sheet(0).doWrite(dataList);
//
//
////       String ss = "12";
////       int s = Integer.valueOf(ss).intValue() + 1;
////        System.out.println(String.format("%02d",s));
////        OperIndexUtil.oper("5");
//
//
////        String s = "\t@ExcelProperty(value = {\"姓名\", \"姓名\"}, index = 0）";
////        String pattern = "[0-9]*";
////        Pattern r = Pattern.compile(pattern);
////        Matcher matcher = r.matcher(s);
////        System.out.println(matcher.matches());
////        String ss = "index = 0";
////        int index1 = ss.lastIndexOf("index");
////        System.out.println(index1);
////        System.out.println(ss.charAt(index1+8));
//
//        OperIndexUtil.oper("0");
//        String []keywords = new String[]{"Digits", "NumberFormat", "NotBlank", "DateFormat"};
//        OperIndexUtil.deleteLine(keywords);
//
//        String []keywords2 = new String[]{"基数", "总额", "金额"};
//        String[] keywords3 = new String[]{"比例"};
//        String message = "@NumberFormat(\"#.####\")";
//        OperIndexUtil.addAnnotation(message, keywords3);

//        int v = (int)(Math.random() * 900.0D + 100.0D);
//        double v = Math.random();
//        System.out.println(v);


//        Integer[] arrays = new Integer[]{14,17};
        OperIndexUtil.indexAdd(26, -1);


//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.length());
    }
}
