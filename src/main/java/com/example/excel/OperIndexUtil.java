package com.example.excel;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperIndexUtil {

    public static void indexAdd(Integer index, Integer num) throws Exception {
        String fileName ="E:\\model\\domain.txt";
        String fileName2 = "E:\\model\\domain2.txt";
        FileReader input = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(input);

        FileWriter wr = new FileWriter(fileName2);
        BufferedWriter writer = new BufferedWriter(wr);
        while (true){
            String s  = reader.readLine();
            if(s == null){
                break;
            }
            int index1 = s.indexOf("index");
            if(index1 != -1){
                Pattern r = Pattern.compile("[0-9]+");
                Matcher matcher = r.matcher(s);
//                int start = index1+8;
//                int end = s.length()-2;
                if(!matcher.find()){
                    continue;
                }
                int start = matcher.start();
                int end = matcher.end();
                Integer oldIndexVal = Integer.valueOf(matcher.group());

                if(oldIndexVal.compareTo(index) >= 0){
                    Integer newVal = oldIndexVal+num;
                    String newIndexVal = String.valueOf(newVal);
                    String startStr = s.substring(0, start);
                    String endStr = s.substring(end);
                    s = startStr + newIndexVal +endStr;

                }
            }
            writer.write(s+"\n");
        }
        writer.flush();
    }

    public static void deleteLine(String[] keywords) throws Exception {
        String fileName ="E:\\model\\domain.txt";
        String fileName2 = "E:\\model\\domain2.txt";
        FileReader input = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(input);

        FileWriter wr = new FileWriter(fileName2);
        BufferedWriter writer = new BufferedWriter(wr);
        while (true){
            boolean isUseful = true;
            String s  = reader.readLine();
            if(s == null){
                break;
            }
            for(String keyword: keywords){
                int index1 = s.indexOf(keyword);
                if(index1 != -1){
                    isUseful = false;
                    break;
                }
            }
            if(isUseful){
                writer.write(s+"\n");
            }

        }
        writer.flush();
    }

    public static void addAnnotation(String strformat, String[] keywords) throws Exception {
        String fileName ="E:\\model\\domain.txt";
        String fileName2 = "E:\\model\\domain2.txt";
        FileReader input = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(input);

        FileWriter wr = new FileWriter(fileName2);
        BufferedWriter writer = new BufferedWriter(wr);
        while (true){
            boolean isUseful = false;
            String s  = reader.readLine();
            if(s == null){
                break;
            }
            for(String keyword: keywords){
                int index1 = s.indexOf(keyword);
                if(index1 != -1){
                    isUseful = true;
                    break;
                }
            }
            //找name
            String finnalName = "";
            if(s.indexOf("ExcelProperty") != -1 && s.indexOf("import") == -1){
                int start = s.indexOf("{");
                int end = s.indexOf("}");
                String substring = s.substring(start + 1, end);
                String userfulStr = substring.replace(" ", "");
                String[] split = userfulStr.split(",");
                String stardStr = split[0];
                finnalName = userfulStr.replace(",","");
                boolean isequalls = true;
                for(String splitStr : split){
                    if(!stardStr.equals(splitStr)){
                        isequalls = false;
                        break;
                    }
                }
                if(isequalls){
                    finnalName = stardStr;
                }
            }
            if(isUseful){
                String str = String.format(strformat, finnalName);
                writer.write(str+"\n");
            }
            writer.write(s+"\n");

        }
        writer.flush();
    }
}
