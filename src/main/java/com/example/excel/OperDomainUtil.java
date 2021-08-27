//package com.example.excel;
//
//import com.alibaba.excel.annotation.ExcelProperty;
//
//import java.lang.reflect.Field;
//
//public class OperDomainUtil {
//    public static void indexAdd(BaseDomain domain, int fromIndex){
//        Class aClass = domain.getClass();
//        Field[] fields = aClass.getDeclaredFields();
//        for(Field field : fields){
//            field.setAccessible(true);
//            ExcelProperty excelProperty = field.getAnnotation(ExcelProperty.class);
//            if(excelProperty != null){
//                int index = excelProperty.index();
//            }
//        }
//    }
//}
