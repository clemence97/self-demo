package com.example.muiltThread;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

    public class DomainDemo{
        private String str;
        DomainDemo(String str){
            this.str = str;
        }

        @Override
        public int hashCode(){
            if(str.contains("1")){
                return 1;
            }
            return 0;
        }
    }


    public HashMap isTreeifyBin(){
        HashMap map = new HashMap();

        DomainDemo domainDemo1 = new DomainDemo("111");
        DomainDemo domainDemo2 = new DomainDemo("199");
        DomainDemo domainDemo3 = new DomainDemo("122");
        DomainDemo domainDemo4 = new DomainDemo("133");
        DomainDemo domainDemo5 = new DomainDemo("144");
        DomainDemo domainDemo6 = new DomainDemo("155");
        DomainDemo domainDemo7 = new DomainDemo("166");
        DomainDemo domainDemo8 = new DomainDemo("177");
        DomainDemo domainDemo9 = new DomainDemo("188");
        map.put(domainDemo1, domainDemo1);
        map.put(domainDemo2, domainDemo2);
        map.put(domainDemo3, domainDemo3);
        map.put(domainDemo4, domainDemo4);
        map.put(domainDemo5, domainDemo5);
        map.put(domainDemo6, domainDemo6);
        map.put(domainDemo7, domainDemo7);
        map.put(domainDemo8, domainDemo8);
        map.put(domainDemo9, domainDemo9);

        return map;
    }

//    public void safeMap(){
//        ConcurrentHashMap map = new ConcurrentHashMap();
//        map.put()
//    }










}
