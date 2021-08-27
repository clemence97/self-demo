package com.example.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class OperExcel {

    public void writeData(){
        DetailDomain domain = new DetailDomain();
        Class aClass = domain.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for(Field field : fields){

        }
    }
}
