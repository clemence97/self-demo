package com.example.jexl;

import org.apache.commons.jexl3.*;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Demo {


    public static Object convertToCode(String jexlExp, Map<String, Object> map){
        //创建一个引擎
        JexlEngine jexl = new JexlBuilder().create();
        //创建一个表达式
        JexlExpression expression = jexl.createExpression(jexlExp);

        //创建上下文并添加数据
        JexlContext jc = new MapContext();
        for(Map.Entry<String, Object> entry : map.entrySet()){
            jc.set(entry.getKey(),entry.getValue());
        }
        return expression.evaluate(jc);

    }


    /**
     * 测试
     */
    public void test (){
        String code = "frequency >= 1";
        Map<String, Object> map = new HashMap<>();
        map.put("frequency", 1);
        Object o = convertToCode(code, map);
        System.out.println(o);
    }

}
