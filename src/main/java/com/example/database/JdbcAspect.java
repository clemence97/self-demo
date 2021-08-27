//package com.example.database;
//
//import com.alibaba.fastjson.JSON;
//import com.ibm.framework.dal.dao.support.sql.FreeMakerParser;
//import com.ibm.framework.dal.resource.parse.SqlBean;
//import com.ibm.framework.dal.resource.parse.XmlParser;
//import com.ibm.framework.dal.util.PaginationResult;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//@Aspect
//@Component
//public class JdbcAspect {
//    private static final Logger logger = LoggerFactory.getLogger("humancloud.client");
//
//    public JdbcAspect() {
//    }
//    @Pointcut("execution(* com.ibm.framework.dal.client.support.*DalClient.queryForList(..))||" +
//            "execution(* com.ibm.framework.dal.client.support.*Client.queryForList(..))||" +
//            "execution(* com.ibm.framework.dal.client.support.*Client.queryForObject(..))||" +
//            "execution(* com.ibm.framework.dal.client.support.*Client.dynamicMerge(..))||" +
//            "execution(* com.ibm.framework.dal.client.support.*Client.queryForMap(..))||" +
//            "execution(* com.ibm.framework.dal.client.support.*Client.execute(..))||" +
//            "execution(* com.ibm.framework.dal.client.support.*Client.find(..))||" +
//            "execution(* com.ibm.framework.dal.client.support.*Client.batchUpdate(..))")
//    public void jdbcAuditLogPointCut() {
//    }
//
//    @Around("jdbcAuditLogPointCut()")
//    public Object jdbcAuditLogAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
//        Object[] args = joinPoint.getArgs();
//        XmlParser xmlParser = XmlParser.getInstance();
//        String sqlId = args[0].toString();
//        String[] split = sqlId.split("\\.");
//        String fileName = split[0];
//        ClassPathResource classPathResource = new ClassPathResource("conf/sqlMap/sqlMap_"+fileName+".xml");
//        Resource[] resources = {classPathResource};
//        Map<String, SqlBean> sqlContainer = new HashMap();
//        xmlParser.parse(resources,sqlContainer);
//        SqlBean sqlBean = sqlContainer.get(sqlId);
//        String str = JSON.toJSONString(args[1]);
//        Map map = JSON.parseObject(str, Map.class);
//        String sql = FreeMakerParser.process(map, sqlBean.getContent(), sqlId);
//        Object result = joinPoint.proceed();
//        String resultStr = "";
//        if (result instanceof PaginationResult){
//            Object r = ((PaginationResult) result).getR();
//            resultStr = JSON.toJSONString(r);
//        }else {
//            resultStr = JSON.toJSONString(result);
//        }
//        resultStr = resultStr.trim();
//        int length = resultStr.length();
//        if (length > 501){
//            resultStr = resultStr.substring(0,500);
//        }
//        sql = replaceSql(sql,map);
//        logger.info("[\"sql\":\"{}\"] [\"result\":\"{}\"]",sql.trim(),resultStr);
//        return result;
//    }
//
//    private String replaceSql(String sql, Map<String,Object> map) {
//        Set<Map.Entry<String, Object>> entries = map.entrySet();
//        for (Map.Entry<String,Object> set : entries){
//            String key = set.getKey();
//            String value = set.getValue().toString();
//            sql = sql.replaceAll(":"+key,value);
//        }
//        return sql;
//    }
//
//    private String getParamsByMap(String sqlId,Map<String,Object> map) {
//        if (map.size()>0){
//            StringBuilder params = new StringBuilder();
//            for(Map.Entry<String,Object> entry : map.entrySet()){
//                String mapKey = entry.getKey();
//                Object mapValue = entry.getValue();
//                if (mapValue != null){
//                    params.append("^");
//                    params.append(params).append(mapKey).append(":").append(mapValue);
//                }
//            }
//            return params.toString();
//        }else {
//            return "";
//        }
//    }
//
//}
//
