package com.test;

import java.util.HashMap;

public enum BaseEnum {
    NO_FILL((byte)0, "待填写");

    private byte code;
    private String desc;

    BaseEnum(byte code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


    private static HashMap<Byte, BaseEnum> codeNodeHandleMap = new HashMap<>();

    static {
        for(BaseEnum nodeHandleEnum : BaseEnum.values()){
            codeNodeHandleMap.put(nodeHandleEnum.getCode(), nodeHandleEnum);
        }
    }

    public static BaseEnum getNodeHandleEnumByCode(byte code){
        return codeNodeHandleMap.get(code);
    }

}
