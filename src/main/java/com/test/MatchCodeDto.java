package com.test;

import lombok.Data;

@Data
public class MatchCodeDto {

    private String fieldCode;

    private String fieldName;

    private String alias;

    private String conditionStr;

    private String conditionValue;

    private int assignNeed;

    /**
     * fieldName/alias 不为空时必填
     */
    private Long formId;

    /**
     * alias 不为空时必填
     */
    private Long configId;

    /**
     * alias不为空时必填
     */
    private String mappingForm;

}
