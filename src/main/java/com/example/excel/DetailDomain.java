package com.example.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author wangzhaojun
 * @date 2020/4/15  13:58
 */
@Data
public class DetailDomain implements Serializable {

    private static final long serialVersionUID = -7826978512935318057L;
    @ExcelProperty(value = {"姓名", "姓名"}, index = 0)
    private String name;
    @ExcelProperty(value = {"身份证号", "身份证号"}, index = 1)
    private String idcard;

    @ExcelProperty(value = {"费用月份", "费用月份"}, index = 2)
    private String feeyearmonth;

    @ExcelProperty(value = {"费用类型", "费用类型"}, index = 3)
    private String feetype;

    @ExcelProperty(value = {"缴纳地区", "缴纳地区"}, index = 4)
    private String region;

    @ExcelProperty(value = {"养老保险", "城市"}, index = 5)
    private String yanglaobxcity;


    @ExcelProperty(value = {"养老保险", "基数"}, index = 6)
    private String yanglaobxbase;


    @ExcelProperty(value = {"养老保险", "总额"}, index = 7)
    private String yanglaobxtotal;


    @ExcelProperty(value = {"养老保险", "单位金额"}, index = 8)
    private String yanglaobxorgfee;


    @ExcelProperty(value = {"养老保险", "单位比例"}, index = 9)
    private BigDecimal yanglaobxorgrate;


    @ExcelProperty(value = {"养老保险", "单位附加金额"}, index = 10)
    private String yanglaobxorgextrafee;


    @ExcelProperty(value = {"养老保险", "个人金额"}, index = 11)
    private String yanglaobxempfee;


    @ExcelProperty(value = {"养老保险", "个人比例"}, index = 12)
    private BigDecimal yanglaobxemprate;


    @ExcelProperty(value = {"养老保险", "个人附加金额"}, index = 13)
    private String yanglaobxempextrafee;

    @ExcelProperty(value = {"医疗保险", "城市"}, index = 14)
    private String yiliaobxcity;


    @ExcelProperty(value = {"医疗保险", "基数"}, index = 15)
    private String yiliaobxbase;


    @ExcelProperty(value = {"医疗保险", "总额"}, index = 16)
    private String yiliaobxtotal;


    @ExcelProperty(value = {"医疗保险", "单位金额"}, index = 17)
    private String yiliaobxorgfee;


    @ExcelProperty(value = {"医疗保险", "单位比例"}, index = 18)
    private BigDecimal yiliaobxorgrate;


    @ExcelProperty(value = {"医疗保险", "单位附加金额"}, index = 19)
    private String yiliaobxorgextrafee;


    @ExcelProperty(value = {"医疗保险", "个人金额"}, index = 20)
    private String yiliaobxempfee;


    @ExcelProperty(value = {"医疗保险", "个人比例"}, index = 21)
    private BigDecimal yiliaobxemprate;


    @ExcelProperty(value = {"医疗保险", "个人附加金额"}, index = 22)
    private String yiliaobxempextrafee;

    @ExcelProperty(value = {"失业保险", "城市"}, index = 23)
    private String shiyebxcity;


    @ExcelProperty(value = {"失业保险", "基数"}, index = 24)
    private String shiyebxbase;


    @ExcelProperty(value = {"失业保险", "总额"}, index = 25)
    private String shiyebxtotal;

    @ExcelProperty(value = {"失业保险", "单位金额"}, index = 26)
    private String shiyebxorgfee;


    @ExcelProperty(value = {"失业保险", "单位比例"}, index = 27)
    private BigDecimal shiyebxorgrate;


    @ExcelProperty(value = {"失业保险", "单位附加金额"}, index = 28)
    private String shiyebxorgextrafee;


    @ExcelProperty(value = {"失业保险", "个人金额"}, index = 29)
    private String shiyebxempfee;


    @ExcelProperty(value = {"失业保险", "个人比例"}, index = 30)
    private BigDecimal shiyebxemprate;


    @ExcelProperty(value = {"失业保险", "个人附加金额"}, index = 31)
    private String shiyebxempextrafee;

    @ExcelProperty(value = {"工伤保险", "城市"}, index = 32)
    private String gongshangbxcity;


    @ExcelProperty(value = {"工伤保险", "基数"}, index = 33)
    private String gongshangbxbase;


    @ExcelProperty(value = {"工伤保险", "总额"}, index = 34)
    private String gongshangbxtotal;


    @ExcelProperty(value = {"工伤保险", "单位金额"}, index = 35)
    private String gongshangbxorgfee;


    @ExcelProperty(value = {"工伤保险", "单位比例"}, index = 36)
    private BigDecimal gongshangbxorgrate;


    @ExcelProperty(value = {"工伤保险", "单位附加金额"}, index = 37)
    private String gongshangbxorgextrafee;


    @ExcelProperty(value = {"工伤保险", "个人金额"}, index = 38)
    private String gongshangbxempfee;


    @ExcelProperty(value = {"工伤保险", "个人比例"}, index = 39)
    private BigDecimal gongshangbxemprate;


    @ExcelProperty(value = {"工伤保险", "个人附加金额"}, index = 40)
    private String gongshangbxempextrafee;


    @ExcelProperty(value = {"生育保险", "城市"}, index = 41)
    private String shengyubxcity;


    @ExcelProperty(value = {"生育保险", "基数"}, index = 42)
    private String shengyubxbase;


    @ExcelProperty(value = {"生育保险", "总额"}, index = 43)
    private String shengyubxtotal;


    @ExcelProperty(value = {"生育保险", "单位金额"}, index = 44)
    private String shengyubxorgfee;


    @ExcelProperty(value = {"生育保险", "单位比例"}, index = 45)
    private BigDecimal shengyubxorgrate;


    @ExcelProperty(value = {"生育保险", "单位附加金额"}, index = 46)
    private String shengyubxorgextrafee;


    @ExcelProperty(value = {"生育保险", "个人金额"}, index = 47)
    private String shengyubxempfee;


    @ExcelProperty(value = {"生育保险", "个人比例"}, index = 48)
    private BigDecimal shengyubxemprate;


    @ExcelProperty(value = {"生育保险", "个人附加金额"}, index = 49)
    private String shengyubxempextrafee;

    @ExcelProperty(value = {"大病医疗保险", "城市"}, index = 50)
    private String dabingbxcity;


    @ExcelProperty(value = {"大病医疗保险", "基数"}, index = 51)
    private String dabingbxbase;


    @ExcelProperty(value = {"大病医疗保险", "总额"}, index = 52)
    private String dabingbxtotal;


    @ExcelProperty(value = {"大病医疗保险", "单位金额"}, index = 53)
    private String dabingbxorgfee;


    @ExcelProperty(value = {"大病医疗保险", "单位比例"}, index = 54)
    private BigDecimal dabingbxorgrate;


    @ExcelProperty(value = {"大病医疗保险", "单位附加金额"}, index = 55)
    private String dabingbxorgextrafee;


    @ExcelProperty(value = {"大病医疗保险", "个人金额"}, index = 56)
    private String dabingbxempfee;


    @ExcelProperty(value = {"大病医疗保险", "个人比例"}, index = 57)
    private BigDecimal dabingbxemprate;


    @ExcelProperty(value = {"大病医疗保险", "个人附加金额"}, index = 58)
    private String dabingbxempextrafee;

    @ExcelProperty(value = {"残疾人保障金", "城市"}, index = 59)
    private String canjibzjcity;


    @ExcelProperty(value = {"残疾人保障金", "基数"}, index = 60)
    private String canjibzjbase;


    @ExcelProperty(value = {"残疾人保障金", "总额"}, index = 61)
    private String canjibzjtotal;


    @ExcelProperty(value = {"残疾人保障金", "单位金额"}, index = 62)
    private String canjibzjorgfee;


    @ExcelProperty(value = {"残疾人保障金", "单位比例"}, index = 63)
    private BigDecimal canjibzjorgrate;


    @ExcelProperty(value = {"残疾人保障金", "单位附加金额"}, index = 64)
    private String canjibzjorgextrafee;


    @ExcelProperty(value = {"残疾人保障金", "个人金额"}, index = 65)
    private String canjibzjempfee;


    @ExcelProperty(value = {"残疾人保障金", "个人比例"}, index = 66)
    private BigDecimal canjibzjemprate;


    @ExcelProperty(value = {"残疾人保障金", "个人附加金额"}, index = 67)
    private String canjibzjempextrafee;

    @ExcelProperty(value = {"补充工伤保险", "城市"}, index = 68)
    private String buchonggscity;


    @ExcelProperty(value = {"补充工伤保险", "基数"}, index = 69)
    private String buchonggsbase;


    @ExcelProperty(value = {"补充工伤保险", "总额"}, index = 70)
    private String buchonggstotal;


    @ExcelProperty(value = {"补充工伤保险", "单位金额"}, index = 71)
    private String buchonggsorgfee;


    @ExcelProperty(value = {"补充工伤保险", "单位比例"}, index = 72)
    private BigDecimal buchonggsorgrate;


    @ExcelProperty(value = {"补充工伤保险", "单位附加金额"}, index = 73)
    private String buchonggsorgextrafee;


    @ExcelProperty(value = {"补充工伤保险", "个人金额"}, index = 74)
    private String buchonggsempfee;


    @ExcelProperty(value = {"补充工伤保险", "个人比例"}, index = 75)
    private BigDecimal buchonggsemprate;


    @ExcelProperty(value = {"补充工伤保险", "个人附加金额"}, index = 76)
    private String buchonggsempextrafee;


    @ExcelProperty(value = {"补充医疗保险", "城市"}, index = 77)
    private String buchongyiliaobxcity;


    @ExcelProperty(value = {"补充医疗保险", "基数"}, index = 78)
    private String buchongyiliaobxbase;


    @ExcelProperty(value = {"补充医疗保险", "总额"}, index = 79)
    private String buchongyiliaobxtotal;


    @ExcelProperty(value = {"补充医疗保险", "单位金额"}, index = 80)
    private String buchongyiliaobxorgfee;


    @ExcelProperty(value = {"补充医疗保险", "单位比例"}, index = 81)
    private BigDecimal buchongyiliaobxorgrate;


    @ExcelProperty(value = {"补充医疗保险", "单位附加金额"}, index = 82)
    private String buchongyiliaobxorgextrafee;


    @ExcelProperty(value = {"补充医疗保险", "个人金额"}, index = 83)
    private String buchongyiliaobxempfee;


    @ExcelProperty(value = {"补充医疗保险", "个人比例"}, index = 84)
    private BigDecimal buchongyiliaobxemprate;


    @ExcelProperty(value = {"补充医疗保险", "个人附加金额"}, index = 85)
    private String buchongyiliaobxempextrafee;


    @ExcelProperty(value = {"公积金", "城市"}, index = 86)
    private String zhufanggjjcity;


    @ExcelProperty(value = {"公积金", "基数"}, index = 87)
    private String zhufanggjjbase;


    @ExcelProperty(value = {"公积金", "总额"}, index = 88)
    private String zhufanggjjtotal;


    @ExcelProperty(value = {"公积金", "单位金额"}, index = 89)
    private String zhufanggjjorgfee;


    @ExcelProperty(value = {"公积金", "单位比例"}, index = 90)
    private BigDecimal zhufanggjjorgrate;


    @ExcelProperty(value = {"公积金", "单位附加金额"}, index = 91)
    private String zhufanggjjorgextrafee;


    @ExcelProperty(value = {"公积金", "个人金额"}, index = 92)
    private String zhufanggjjempfee;


    @ExcelProperty(value = {"公积金", "个人比例"}, index = 93)
    private BigDecimal zhufanggjjemprate;


    @ExcelProperty(value = {"公积金", "个人附加金额"}, index = 94)
    private String zhufanggjjempextrafee;

    @ExcelProperty(value = {"其他费用", "城市"}, index = 95)
    private String zonghebxcity;


    @ExcelProperty(value = {"其他费用", "总额"}, index = 96)
    private String zonghebxtotal;


    @ExcelProperty(value = {"其他费用", "单位金额"}, index = 97)
    private String zonghebxorgfee;

//
//	@ExcelProperty(value = {"其他费用", "单位比例"}, index = 81)
//	private String zonghebxorgrate;

//
//	@ExcelProperty(value = {"其他费用", "单位附加金额"}, index = 82)
//	private String zonghebxorgextrafee;


    @ExcelProperty(value = {"其他费用", "个人金额"}, index = 98)
    private String zonghebxempfee;

//
//	@ExcelProperty(value = {"其他费用", "个人比例"}, index = 84)
//	private String zonghebxemprate;
//
//
//	@ExcelProperty(value = {"其他费用", "个人附加金额"}, index = 85)
//	private String zonghebxempextrafee;


    @ExcelProperty(value = {"服务费", "金额（含税）"}, index = 99)
    private String feeincluderate;


    @ExcelProperty(value = {"服务费", "金额（不含税）"}, index = 100)
    private String feeexcluderate;


    @ExcelProperty(value = {"服务费", "增值税"}, index = 101)
    private String addvaluetax;


    @ExcelProperty(value = {"单位小计", "单位小计"}, index = 102)
    private String orgtotal;


    @ExcelProperty(value = {"个人小计", "个人小计"}, index = 103)
    private String emptotal;


    @ExcelProperty(value = {"小计", "小计"}, index = 104)
    private String channeltotal;

    @ExcelProperty(value = {"备注", "备注"}, index = 105)
    private String content;
}
