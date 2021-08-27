package com.example.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;


@Data
public class Domain {
    @ExcelProperty(value = "个人")
    private String empfee;
    @ExcelProperty(value = "公司")
    private String orgfee;
    @ExcelProperty(value = "总计")
    private String totalfee;
    @ExcelProperty(value = "val1")
    private String val1;
    @ExcelProperty(value = "val2")
    private String val2;
    @ExcelProperty(value = "val3")
    private String val3;
    @ExcelProperty(value = "val4")
    private String val4;
    @ExcelProperty(value = "val5")
    private String val5;
    @ExcelProperty(value = "val6")
    private String val6;
    @ExcelProperty(value = "val7")
    private String val7;
    @ExcelProperty(value = "val8")
    private String val8;
    @ExcelProperty(value = "val9")
    private String val9;
}
