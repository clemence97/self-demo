package com.example.service;

import com.google.common.collect.Lists;
import org.apache.commons.collections4.ListUtils;

import java.io.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mapper {

    public static void genMapper(String className, String entityPath, String destMapperPath) throws Exception {

        entityPath = entityPath + className +".java";

        String tableName = getTableName(entityPath);
        String namespace = getNameSpace(tableName);

        StringBuffer mapperContent = new StringBuffer();
        mapperContent.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
        mapperContent.append("<sqlMap namespace=\""+namespace+"\">\n");

        List<String> tableFieldNameList = getTableFieldNameList(entityPath);
        getSql(tableName, tableFieldNameList, mapperContent);
        mapperContent.append("\n");
        updateCanNullSql(tableName, tableFieldNameList, mapperContent);

        mapperContent.append("</sqlMap>");

        String path = destMapperPath + "sqlMap_"+namespace.substring(0,1).toLowerCase()+namespace.substring(1)+".xml";
        FileWriter wr = new FileWriter(path);
        BufferedWriter writer = new BufferedWriter(wr);
        writer.write(mapperContent.toString());
        writer.flush();
    }

    private static void updateCanNullSql(String tableName, List<String> tableFieldNameList, StringBuffer mapperContent) {
        String namespace = getNameSpace(tableName);

        mapperContent.append("\t<sql id=\"update"+namespace+"\">\n");
        mapperContent.append("\t\t<![CDATA[\n");


        mapperContent.append("\t\t\t");
        mapperContent.append("update ");
        mapperContent.append(tableName);
        mapperContent.append("\n");


        for(int i = 0 ; i < ListUtils.emptyIfNull(tableFieldNameList).size() ; i++){
            String tableFieldName = tableFieldNameList.get(i);
            String entityFieldName = genHumpFormat(tableFieldName);
            if(i == 0){
                mapperContent.append("\t\t\t");
                mapperContent.append("set " + tableFieldName + "=:" + entityFieldName +",");
                mapperContent.append("\n");
            }
            if(i > 0 && i < tableFieldNameList.size() -1){
                mapperContent.append("\t\t\t\t");
                mapperContent.append(tableFieldName + "=:" + entityFieldName +",");
                mapperContent.append("\n");
            }
            if(i == tableFieldNameList.size() -1){
                mapperContent.append("\t\t\t\t");
                mapperContent.append(tableFieldName + "=:" + entityFieldName);
                mapperContent.append("\n");
            }
        }

        mapperContent.append("\t\t\t");
        mapperContent.append("where id = :id");
        mapperContent.append("\n");
        mapperContent.append("\t\t]]>\n");
        mapperContent.append("\t</sql>\n");

    }

    private static void getSql(String tableName, List<String> tableFieldNameList, StringBuffer mapperContent){
        String namespace = getNameSpace(tableName);

        mapperContent.append("\t<sql id=\"get"+namespace+"s\">\n");
        mapperContent.append("\t\t<![CDATA[\n");


        mapperContent.append("\t\t\t");
        mapperContent.append("select * from ");
        mapperContent.append(tableName);
        mapperContent.append("\n");
        mapperContent.append("\t\t\t");
        mapperContent.append("where active = 1\n");

        for(String tableFieldName : ListUtils.emptyIfNull(tableFieldNameList)){
            String entityFieldName = genHumpFormat(tableFieldName);
            mapperContent.append("\t\t\t");
            mapperContent.append("<#if (");
            mapperContent.append(entityFieldName);
            mapperContent.append("??)>\n");
            mapperContent.append("\t\t\t\t");
            mapperContent.append("and ");
            mapperContent.append(tableFieldName);
            mapperContent.append("=:");
            mapperContent.append(entityFieldName);
            mapperContent.append("\n");
            mapperContent.append("\t\t\t");
            mapperContent.append("</#if>");
            mapperContent.append("\n");
        }

        mapperContent.append("\t\t]]>\n");
        mapperContent.append("\t</sql>\n");
    }

    private static String getNameSpace(String tableName){
        String[] nameArr = tableName.split("_");
        String nameSpace  = upperCaseFirst(nameArr[0]);
        for(int i = 1 ; i < nameArr.length ; i++){
            nameSpace = nameSpace.concat(upperCaseFirst(nameArr[i]));
        }

        return nameSpace;
    }

    private static String upperCaseFirst(String str){
        if(str == null){
            return "";
        }
        return str.substring(0,1).toUpperCase().concat(str.substring(1));
    }


    private static String getTableName(String entityPath) throws Exception {
        FileReader fileReader = new FileReader(entityPath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String tableName = "";
        while (true){
            String lineContent = bufferedReader.readLine();
            if(lineContent == null){
                break;
            }
            if(lineContent.indexOf("@Entity") != -1){
                tableName = getQuotaMarksContent(lineContent);
                break;
            }
        }
        return tableName;
    }



    private static List<String> getTableFieldNameList(String entityPath) throws Exception {
        FileReader fileReader = new FileReader(entityPath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        List<String> tableFieldNameList = Lists.newArrayList();
        while (true){
            String lineContent = bufferedReader.readLine();
            if(lineContent == null){
                break;
            }
            if(lineContent.indexOf("@Column") != -1 && !ignoreField(lineContent)){
                String tableFieldName = getQuotaMarksContent(lineContent);
                tableFieldNameList.add(tableFieldName);
            }
        }
        return tableFieldNameList;
    }

    private static boolean ignoreField(String content){
        if(content.contains("active")
                || content.contains("create_userid")
                || content.contains("create_username")
                || content.contains("create_date")
                || content.contains("update_userid")
                || content.contains("update_username")
                || content.contains("update_date")
        ){
            return true;
        }
        return false;

    }




    private static String getQuotaMarksContent(String content){
        Pattern r = Pattern.compile("\"(.+)\"");
        Matcher matcher = r.matcher(content);
        if(!matcher.find()){
           return null;
        }
        return matcher.group().replace("\"","");
    }

    private static String genHumpFormat(String content){
        String targetContent = "";
        String[] array = content.split("_");
        for (int i = 0; i < array.length; i++){
            String word = array[i];
            if(i == 0){
                targetContent = word;
            }else {
                targetContent = targetContent + word.substring(0,1).toUpperCase()+word.substring(1);
            }
        }
        return targetContent;
    }
}
