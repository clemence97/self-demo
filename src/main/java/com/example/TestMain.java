package com.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.test.Base;
import com.test.BaseEnum;
import org.apache.commons.collections4.ListUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.util.*;

public class TestMain {

    public final static class TA {
        private int a;

        public TA(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }

    public static void main(String []args)  {
//        String str = "@ExcelProperty(index = 0, value = \"城市\")";
//
//        Pattern r = Pattern.compile("[0-9]+");
//        Matcher m = r.matcher(str);
//        System.out.println(m.find());
//        System.out.println(m.group());
//        System.out.println(m.start());


//        List<Domain> list = new ArrayList<>();
//        Map<String, Domain> collect = list.stream().collect(Collectors.toMap(e -> e.getEmpfee(), e -> e));
//        Map<String, Domain> collect2 = list.stream().collect(Collectors.toMap(e -> e.getEmpfee(), e -> e));
//
//        List<Map<String, Domain>> data = new ArrayList<>();
//        System.out.println(data.size());

//        Map<Integer, BigDecimal> map = new HashMap<>();
//        BigDecimal value = new BigDecimal(0.1).setScale(2, BigDecimal.ROUND_HALF_UP);
//        map.put(1, value);
//        map.put(2, value);
//        map.put(3, null);
//        map.put(4, value);
//        map.put(5, null);
//        map.put(6, value);
//        map.put(7, null);
//        map.put(8, value);
//        map.put(9, value);
//        map.put(10, value);
//
//        String json = JSON.toJSONString(map);
//        Map<Integer, BigDecimal> map1 = JSONObject.parseObject(json, Map.class);
//        System.out.println(map1);
//        BigDecimal value6 = (BigDecimal) map1.get(6);
//        System.out.println(value6);
//
//        List<Domain> list = new ArrayList<>();
//        Domain domain = new Domain();
//        domain.setVal1("1");
//        list.add(domain);
//        List<String> collect = list.stream().map(Domain::getVal2).collect(Collectors.toList());
//        for (String val : collect){
//            System.out.println(val);
//        }
//        Byte val
//        System.out.println(3 | 1);
//        Domain domain1 = new Domain();
//        domain1.setTotalfee("111");
//        domain1.setEmpfee("222");
//
//
//        Domain domain2 = new Domain();
//        domain2.setTotalfee(domain1.getTotalfee());
//        domain2.setEmpfee("2");
//
//        domain1.setTotalfee("");
//        System.out.println(JSON.toJSONString(domain1));
//        System.out.println(JSON.toJSONString(domain2));


//        BigDecimal bigDecimal = new BigDecimal("7.00%");
//        System.out.println(bigDecimal);

//        String str1 = "you";
//        String str2 = "are";
//        String join = StringUtils.join(str1, str2, ";");
//        System.out.println(join);

//        List<BaseDomain> list = new ArrayList<>();
//        Map<Long, Long> collect = list.stream().collect(Collectors.groupingBy(base -> base.getId(), Collectors.counting()));
//        System.out.println(collect.get(1));

//        List<BaseDomain> list = new ArrayList<>();
//        BaseDomain domain = new BaseDomain();
//        domain.setScores("1");
//        domain.setId(1L);
//        list.add(domain);
//        test01(list);
//        System.out.println(list);



//            Map<Long, BigDecimal> map = new HashMap<>();
//            map.put(1L,null);
//            map.put(2L,null);
//            System.out.println(map);

//        String eL = "[0-9]{4}-[0-9]{2}";
//        Pattern p = Pattern.compile(eL);
//        Matcher m = p.matcher("2020-08");
//        boolean dateFlag = m.matches();
//        if (!dateFlag) {
//            System.out.println("格式错误");
//        }else {
//            System.out.println("格式正确");
//        }

//        BigDecimal val1 = new BigDecimal(10.00);
//        BigDecimal multiply = val1.divide(new BigDecimal(100)).multiply(new BigDecimal(100));
//        BigDecimal multiply2 = val1.movePointLeft(2).multiply(new BigDecimal(100));
//        System.out.println(multiply);
//        System.out.println(multiply2);

//        BigDecimal val = new BigDecimal(10.23);
//        System.out.println(val.movePointRight(1));
//        System.out.println(val.setScale(0, BigDecimal.ROUND_HALF_UP));

//        String empFee = "2";
//        BigDecimal value = Optional.ofNullable(empFee).map(fee -> new BigDecimal(fee)).orElse(BigDecimal.ZERO);
//        System.out.println(value);

//        List<Domain> list = null;
//        Map<String, Domain> collect = ListUtils.emptyIfNull(list).stream().collect(Collectors.toMap(e -> e.getVal1(), e -> e));
//        System.out.println(collect);
//        System.out.println(collect.get("1"));

//        String str = "";
//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        if(sb.length() > 0){
//            sb.append(";");
//        }
//        System.out.println(sb);
//        for(int i = 0; i < 10; i++){
//            try {
//                System.out.println(10/i);
//            }catch (Exception e){
//                System.out.println(i+"出错了");
////                continue;
//            }
//        }


//        Map<Integer, BigDecimal> baseMap = new HashMap<>();
//        baseMap.put(7, BigDecimal.ONE);
//        Map<Integer, BigDecimal> baseMap2 = new HashMap<>();
//        baseMap2.putAll(baseMap);
//
//        baseMap2.remove(7);
//        System.out.println(JSON.toJSONString(baseMap2));
//        System.out.println(JSON.toJSONString(baseMap));

//        String json = "{\n" +
//                "        \"srcType\":\"save_form\",\n" +
//                "        \"dataFormat\":\"form\",\n" +
//                "        \"mappingRule\":\"3\",\n" +
//                "        \"modifyType\":\"update\",\n" +
//                "        \"extra\":\"biz_id\",\n" +
//                "        \"secondBiz\":\"salarySalesCommission\",\n" +
//                "        \"matchCode\":[\n" +
//                "            {\n" +
//                "                \"fieldName\":\"姓名\",\n" +
//                "                \"conditionStr\":\"=\",\n" +
//                "                \"conditionValue\":\"\",\n" +
//                "                \"assignNeed\":1\n" +
//                "            }\n" +
//                "        ]\n" +
//                "    }";


//        ConfigConvertDto configConvertDto = JSON.parseObject(json, ConfigConvertDto.class);


//        System.out.println(Math.floorMod(11,12));

//        int i = SiDateUtils.monthsDiff("2021-06", "2021-06");
//        System.out.println(i);

//        String monthFmtStr = SiDateUtils.getMonthFmtStr("2020-04-01");
//        System.out.println(monthFmtStr);
//        ChannelBillDetailImportDomain domain = new ChannelBillDetailImportDomain();
//        domain.setArea("上海");
//        List<ChannelBillDetailImportDomain> domainList = Lists.newArrayList();
//        domainList.add(domain);
//
//
//        List<? extends BillDetailDomain> list = Lists.newArrayList();
//        if(1 == 1){
//            list = domainList;
//        }
//        deal(list);


//        String str = "123";
////        System.out.println(str + null);
////        System.out.println(str.concat(null));
//        String str2 = null;
//        List<String> list = Lists.newArrayList();
//        list.add(str2);
//        list.add(str);
//        System.out.println(StringUtils.join(list, ":"));
////        System.out.println(Joiner.on(":").join(list)); //报错
//        String collect = list.stream().filter(e -> e != null).collect(Collectors.joining(":"));
//        System.out.println(collect);
////        System.out.println(Strings.join(list, ":"));
//        StringJoiner joiner = new StringJoiner(":");
//        StringJoiner add = joiner.add(str2).add(str);
//        System.out.println(add.toString());

//        Calendar cal = Calendar.getInstance();
//        int curDay = cal.get(Calendar.DAY_OF_MONTH);
//        int curHour = cal.get(Calendar.HOUR_OF_DAY);
//        int curMinute = cal.get(Calendar.MINUTE);
//
//
//        BigDecimal curHourPlusMinute = new BigDecimal(curMinute).movePointLeft(2).add(new BigDecimal(curHour));
//
//        System.out.println(curHourPlusMinute);

//        Calendar calendar = Calendar.getInstance();
////        calendar.set(Calendar.MONTH, 12);
////        System.out.println(calendar.getTime());
////        System.out.println(calendar.get(Calendar.MONTH));
//        calendar.set(Calendar.DAY_OF_MONTH, 23);
//        calendar.set(Calendar.MONTH, 6);
//
//        System.out.println(calendar.getTime());

//        int planDayOrWeek = 1;
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.DAY_OF_WEEK, planDayOrWeek);
//        calendar.add(Calendar.WEEK_OF_MONTH, 1);
//        System.out.println(DateUtil.format(calendar.getTime(),"yyyy-MM-dd"));

//        List<String> dataList = Lists.newArrayList();
//        List<String> channelList = Collections.EMPTY_LIST;
//        List<String> companyList = Lists.newArrayList("1","2");
//
//        dataList.addAll(channelList);
//        dataList.addAll(companyList);
//        System.out.println(dataList.size());



//        List<String> list = Lists.newArrayList();
//        TA a = new TA(1);
//        TA b = new TA(2);
//
//        list.add("1");
//        list.add(null);
//        list.add("2");
//        System.out.println(a);
//        System.out.println(b);
//        Integer aa = 3;
        //List<StIring> collect = list.stream().map(str -> str.replace(str, "3")).collect(Collectors.toList());


        //Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String str = iterator.next();
//            str = "3";
//        }

//        for(String num : list){
//            System.out.println(num);
////            num.replace(num, "3");
////            System.out.println(num);
//        }
//        System.out.println(list.size());


//        List<Base> list1 = Lists.newArrayList();
//        Base base = new Base();
//        base.setValue("111");
//        base.setRealValue(null);
//        Base base1 = new Base();
//        base1.setValue("222");
//        base1.setRealValue("2");
//        list1.add(base1);
//        list1.add(base);
//
//        Map<String, String> collect = new HashMap<>();
//        for(Base base2 : list1){
//            collect.put(base2.getValue(), base2.getRealValue());
//        }
////        Map<String, String> collect = ListUtils.emptyIfNull(list1).stream().collect(Collectors.toMap(option -> option.getValue(), option -> option.getRealValue()));
//        System.out.println(JSON.toJSONString(collect));


//        String  json = "[{\"detailValue\":\"{\\\"effective\\\": \\\"1\\\", \\\"updateWay\\\": {\\\"detailValue\\\": \\\"2\\\", \\\"detailTypeC]ode\\\": \\\"templateUpdate\\\"}, \\\"detailValue\\\": [{\\\"formId\\\": \\\"\\\", \\\"nodeId\\\": \\\"1393785349277696\\\", \\\"systemCode\\\": \\\"\\\", \\\"systemType\\\": \\\"\\\", \\\"updateType\\\": \\\"\\\", \\\"feedBackName\\\": \\\"增员反馈1\\\", \\\"formCodeOrValue\\\": \\\"\\\"}], \\\"detailTypeCode\\\": \\\"updateSystemNew\\\", \\\"updateEffectiveTime\\\": {\\\"detailValue\\\": \\\"1\\\", \\\"detailTypeCode\\\": \\\"flowEnd\\\"}}\",\"flowId\":1393785317344257,\"id\":1393785622374656,\"nodeId\":1393785622201088,\"typeCode\":\"updateSystemNew\",\"typeName\":\"新更新填表人信息\"},{\"detailValue\":\"{\\\"passNum\\\": 1, \\\"autoPass\\\": 1, \\\"passUnit\\\": \\\"天\\\", \\\"feedBackName\\\": \\\"增员反馈1\\\", \\\"detailTypeCode\\\": \\\"feedBack\\\"}\",\"flowId\":1393785317344257,\"id\":1393785622545664,\"nodeId\":1393785622382592,\"typeCode\":\"feedBack\",\"typeName\":\"反馈设置\"}]";
//
//
//        String json1 = "{\n" +
//                "        \"detailValue\":\"{\\\"effective\\\": \\\"1\\\", \\\"updateWay\\\": {\\\"detailValue\\\": \\\"2\\\", \\\"detailTypeC]ode\\\": \\\"templateUpdate\\\"}, \\\"detailValue\\\": [{\\\"formId\\\": \\\"\\\", \\\"nodeId\\\": \\\"1393785349277696\\\", \\\"systemCode\\\": \\\"\\\", \\\"systemType\\\": \\\"\\\", \\\"updateType\\\": \\\"\\\", \\\"feedBackName\\\": \\\"增员反馈1\\\", \\\"formCodeOrValue\\\": \\\"\\\"}], \\\"detailTypeCode\\\": \\\"updateSystemNew\\\", \\\"updateEffectiveTime\\\": {\\\"detailValue\\\": \\\"1\\\", \\\"detailTypeCode\\\": \\\"flowEnd\\\"}}\",\n" +
//                "        \"flowId\":1393785317344257,\n" +
//                "        \"id\":1393785622374656,\n" +
//                "        \"nodeId\":1393785622201088,\n" +
//                "        \"typeCode\":\"updateSystemNew\",\n" +
//                "        \"typeName\":\"新更新填表人信息\"\n" +
//                "    }";
//        String map = "{\n" +
//                "    \"1393785623165440\":\"1393785651301632\",\n" +
//                "    \"1393785622704896\":\"1393785651288577\",\n" +
//                "    \"1393785622382592\":\"1393785651287297\",\n" +
//                "    \"1393785622781184\":\"1393785651286273\",\n" +
//                "    \"1393785622201088\":\"1393785651286016\",\n" +
//                "    \"1393785622939648\":\"1393785651294976\",\n" +
//                "    \"1393785622554624\":\"1393785651294977\",\n" +
//                "    \"1393785623011840\":\"1393785651301889\"\n" +
//                "}";
//
//        Map<String, String> map1 = JSONObject.parseObject(map, Map.class);
//        List<FlowNodeDetailEntity> list = JSONObject.parseArray(json, FlowNodeDetailEntity.class);
//
//
//        list.forEach(en -> {
//
//            String oldReplaceNodeId = null;
//            String newReplaceNodeId = null;
//            for (Map.Entry<String, String> entry : map1.entrySet()) {
//                if (JSON.toJSONString(en).contains(entry.getKey())) {
//                    oldReplaceNodeId = entry.getKey();
//                    newReplaceNodeId = entry.getValue();
//                    break;
//                }
//            }
//
//            System.out.println(oldReplaceNodeId);
//            System.out.println(newReplaceNodeId);
//        });


//        String str = "{\n" +
//                "    \"autoFilling\":\"{\\\"id\\\":1629181972350,\\\"fieldCode\\\":\\\"\\\",\\\"fieldName\\\":\\\"单选1\\\",\\\"coditions\\\":[{\\\"options\\\":[\\\"fd8a58e0-ff24-11eb-bfe9-43ce5d3e1fab\\\"],\\\"opName\\\":\\\"2\\\",\\\"opValue\\\":\\\"f9357db0-ff24-11eb-bfe9-43ce5d3e1fab\\\"}]}\",\n" +
//                "    \"dataFormat\":\"5\",\n" +
//                "    \"defaultSelected\":\"\",\n" +
//                "    \"formId\":1394053646910208,\n" +
//                "    \"frontId\":1629181971574,\n" +
//                "    \"id\":0,\n" +
//                "    \"isAllowAddOption\":\"1\",\n" +
//                "    \"isAllowDelField\":\"1\",\n" +
//                "    \"isAllowUpdateFieldType\":\"1\",\n" +
//                "    \"isAllowUpdateFieldValue\":\"1\",\n" +
//                "    \"isAllowUpdateFormulas\":\"1\",\n" +
//                "    \"isHide\":0,\n" +
//                "    \"isNotNull\":\"1\",\n" +
//                "    \"isRepeat\":\"0\",\n" +
//                "    \"isSensitive\":\"0\",\n" +
//                "    \"name\":\"单选2\",\n" +
//                "    \"option\":\"{\\\"colorMark\\\":0,\\\"options\\\":[{\\\"name\\\":\\\"2\\\",\\\"value\\\":\\\"f9357db0-ff24-11eb-bfe9-43ce5d3e1fab\\\",\\\"color\\\":\\\"#0A8080\\\"},{\\\"name\\\":\\\"1\\\",\\\"value\\\":\\\"f935a4c0-ff24-11eb-bfe9-43ce5d3e1fab\\\",\\\"color\\\":\\\"#FF5745\\\"}]}\",\n" +
//                "    \"remark\":\"\",\n" +
//                "    \"source\":\"define\",\n" +
//                "    \"status\":0,\n" +
//                "    \"typeValue\":5\n" +
//                "}";
//
//        CreateFlowFieldVo createFieldVo = JSONObject.parseObject(str, CreateFlowFieldVo.class);
//        FlowFieldAutoFillingVo flowFieldAutoFillingVo = JSONObject.parseObject(createFieldVo.getAutoFilling(), FlowFieldAutoFillingVo.class);

//        String signatureIds = "123";
//        String[] split = signatureIds.split(",");
//        System.out.println(split);

//        String[] signatureIdList = new String[0];
//        String signatureIds = "111";
//        if(!StringUtils.isEmpty(signatureIds)){
//            signatureIdList = signatureIds.split(",");
//        }
//
//        System.out.println(JSON.toJSONString(signatureIdList));
//        System.out.println(signatureIdList.length);

//        Base base = new Base();
//        base.setValue("1");
//        processsubMethod(base);
//        System.out.println(JSON.toJSONString(base));


//        List<String> list = Lists.newArrayList();
//        list.get(0);

//        List<Base> bases = JSONObject.parseArray("", Base.class);
//        System.out.println(bases);
//        dealmap();

//        Long[] re1 = {1L,2L,3L};
//        Long[] re2 = {4L,1L,2L,3L};
//
//        List<Long> l1 = Arrays.asList(re1);
//        List<Long> l2 = Arrays.asList(re2);
//
//        System.out.println(l2.contains(l1));

//        Base base = new Base();
//        deal(base);
//        System.out.println(JSON.toJSONString(base));
//        byte s = -1;
//        byte b = -1;
//
//        System.out.println(s & b);


//        byte[] arr = new byte[]{1,2,4,8,16,32};
//        byte[] arr2 = new byte[]{1,2,4,8,16,32};
//
//
//        for(byte a1: arr){
//            for(byte a2 : arr2){
//                int or = a1 | a2;
//                int and = a1 & a2;
//                System.out.println(a1 + " | " + a2 + " = " + or);
//            }
//        }
//
//        for(byte a1: arr){
//            for(byte a2 : arr2){
//                int or = a1 | a2;
//                int and = a1 & a2;
//                System.out.println(a1 + " & " + a2 + " = " + and);
//            }
//        }
//
//        Map<String, Object> map = new HashMap<>();
//        map.put("base", "4000");
//
//        Map<String, Object> newMap = new HashMap();
//        newMap.put("base","");
//
//        map.putAll(newMap);
//        System.out.println(JSON.toJSONString(map));

        int calMonthNum = getCalMonthNum("2020-10", "", "2019-10", "当年首次入职学生");
        System.out.println(calMonthNum);
    }


//    private static void deal(Base base){
//        String str = "{\n" +
//                "        \"value\":\"11\",\n" +
//                "        \"realValue\":\"22\"\n" +
//                "    }";
//        base = JSONObject.parseObject(str, Base.class);
//    }
//    private static void processsubMethod(Base base) {
//        Base base2 = new Base();
//        base2.setValue("2");
//        base = base2;
//
//    }

//    private static boolean isFlowEndHandleFlag(){
//        BaseEnum nodeHandleEnum = null;
//        switch (nodeHandleEnum){
//            case null:
//            case NO_FILL:
//                return true;
//            default:
//                return false;
//        }
//    }
    private static void dealmap(){
        Map<String, Object> map = new HashMap<>();
        map.put("clemence", "23");
        for(Map.Entry<String, Object> entry : map.entrySet()){
            map.put("clemence", "24");

            Object old = entry.getValue();
            System.out.println(old.toString());
        }
    }


    /**
     * 获取月份间隔  lastDate - firstDate
     *
     * eg: firstDate: 2021-01
     *     lastDate:  2021-10
     *     result:    9
     *
     * @param firstDate 较小月份 yyyy-MM
     * @param lastDate  较大月份 yyyy-MM
     * @return
     */
    public static int monthDiff(String lastDate, String firstDate){
        Assert.notNull("firstDate", "firstDate不能为空");
        Assert.notNull("lastDate", "lastDate不能为空");

        String[] firstArr = firstDate.split("-");
        String[] lastArr = lastDate.split("-");

        int firstYear = Integer.valueOf(firstArr[0]);
        int firstMonth = Integer.valueOf(firstArr[1]);
        int lastYear = Integer.valueOf(lastArr[0]);
        int lastMonth = Integer.valueOf(lastArr[1]);

        int intervalYear = lastYear - firstYear;
        int intervalMonth = lastMonth - firstMonth;
        return intervalYear*12 + intervalMonth;
    }


    /**
     * 专为个税计算月份间隔使用(雇员)
     *
     * @param lastDate
     * @param firstDate
     * @return
     */
    public static int monthDiffForTaxEmployee(String lastDate, String firstDate){
        Assert.notNull("firstDate", "firstDate不能为空");
        Assert.notNull("lastDate", "lastDate不能为空");

        String[] firstArr = firstDate.split("-");
        String[] lastArr = lastDate.split("-");

        int intervalMonth = monthDiff(lastDate, firstDate);
        int firstYear = Integer.valueOf(firstArr[0]);
        int firstMonth = Integer.valueOf(firstArr[1]);
        int lastYear = Integer.valueOf(lastArr[0]);
        int lastMonth = Integer.valueOf(lastArr[1]);

        if(intervalMonth < 0) {
            return 0;
        }else if(lastYear > firstYear){
            return lastMonth;
        }else {
            return intervalMonth + 1;
        }
    }


    /**
     * 专为个税计算月份间隔使用(大学生)
     *
     * @param lastDate
     * @param firstDate
     * @return
     */
    public static int monthDiffForTaxStudent(String lastDate, String firstDate){
        Assert.notNull("firstDate", "firstDate不能为空");
        Assert.notNull("lastDate", "lastDate不能为空");

        String[] firstArr = firstDate.split("-");
        String[] lastArr = lastDate.split("-");

        int intervalMonth = monthDiff(lastDate, firstDate);
        int firstYear = Integer.valueOf(firstArr[0]);
        int firstMonth = Integer.valueOf(firstArr[1]);
        int lastYear = Integer.valueOf(lastArr[0]);
        int lastMonth = Integer.valueOf(lastArr[1]);

        if(intervalMonth < 0) {
            return 0;
        }else {
            return lastMonth;
        }
    }


    private static int getCalMonthNum(String joinDate, String leaveDate, String taxMonth, String employeeType){

        int calMonthNum;
        if(StringUtils.isNotBlank(leaveDate)){
            int intervalMonth = monthDiff(leaveDate, taxMonth);
            if(intervalMonth < 0){
                if("当年首次入职学生".equals(employeeType)){
                    calMonthNum = monthDiffForTaxStudent(taxMonth, joinDate);
                }else {
                    calMonthNum = monthDiffForTaxEmployee(leaveDate, joinDate);
                }

                return calMonthNum;
            }
        }


        if("当年首次入职学生".equals(employeeType)){
            calMonthNum = monthDiffForTaxStudent(taxMonth, joinDate);
        }else {
            calMonthNum = monthDiffForTaxEmployee(taxMonth, joinDate);
        }


        return calMonthNum;
    }


}
