//package com.example.database;
//
//import com.humancloud.jsb.si.service.util.SiDateUtils;
//import com.ibm.framework.dal.client.support.PaginationDalClient;
//import com.ibm.framework.dal.dao.support.sql.FreeMakerParser;
//import com.ibm.framework.dal.resource.parse.SqlBean;
//import com.ibm.framework.dal.util.DalUtils;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@Slf4j
//@Component
//public class DataBaseLog extends PaginationDalClient {
//
//    public void getSql(String sqlId, Object obj){
//        SqlBean sqlBean = this.getSQL(sqlId);
//        Map<String, Object> paramMap = DalUtils.convertToMap(obj);
//
//		String sql = FreeMakerParser.process(paramMap, sqlBean.getContent(), sqlId);
//		for(String key : paramMap.keySet()) {
//            Object value = paramMap.get(key);
//            if (value instanceof String) {
//                String value1 = (String) value;
//                sql = sql.replace(":" + key, "\""+value1+"\"");
//            }
//            if (value instanceof Date) {
//                String value1 = SiDateUtils.dateFormat((Date) value, SiDateUtils.DATE_TIME_PATTERN);
//                sql = sql.replace(":" + key, value1);
//            }
//            if (value instanceof List) {
//                List valueList = (List) value;
//                Object value1 = valueList.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(",", "(", ")"));
//                sql = sql.replace(":" + key, value1.toString());
//            }
//            if (value instanceof Number) {
//                String value1 = String.valueOf(value);
//                sql = sql.replace(":" + key, value1);
//            }
//        }
//		log.info("sqlId--{},paramMap--{}", sqlId, paramMap);
//		log.info("sql--{}", sql);
//    }
//}
