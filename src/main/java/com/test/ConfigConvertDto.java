package com.test;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ConfigConvertDto implements Serializable {

    /** 通用配置 */
    /** 确定表单 */
    private String srcType;
    private String dataFormat;
    private String secondBiz;
    private String secondBizs;
    private String extra;
    private String srcData;

    /** 保存和校验时 映射，转换规则 */
    private String mappingRule;
    private String mappingForm;
    private List<MatchCodeDto> matchCode;


    /** 取数用 */
    /** 校验用 */

    /** 存数用 */
    private String modifyType;

    /** 新创建字段的类型 */
    private String createFieldType;

    /** 保存时，额外新加的字段和值*/
    /**
     *   [{"sysTypeValue": "1",  "fieldCode": "source", data:"是“}]
     */
    private String extraKeyToData;
}
