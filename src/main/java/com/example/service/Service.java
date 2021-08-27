package com.example.service;

import java.io.*;

public class Service {
    public static void genService(String className, String destServicePath ) throws IOException {

        String tableName = className.substring(0, className.indexOf("Entity"));

        StringBuffer serviceContent = new StringBuffer();
        serviceContent.append("import com.ibm.framework.dal.util.Pagination;\n");
        serviceContent.append("import com.ibm.framework.dal.util.PaginationResult;\n");
        serviceContent.append("import com.nc.framework.service.AbstractService;\n");
        serviceContent.append("import org.apache.dubbo.config.annotation.Reference;\n");
        serviceContent.append("import org.apache.dubbo.config.annotation.Service;\n");
        serviceContent.append("import java.util.Date;\n");
        serviceContent.append("import java.util.List;\n");
        serviceContent.append("import java.util.Map;\n\n");
        serviceContent.append("public interface I");
        serviceContent.append(tableName);
        serviceContent.append("Service { ");

        serviceContent.append("\n\t");
        serviceContent.append("void add");
        serviceContent.append(className);
        serviceContent.append("(" + className + " entity, String userid, String username);");

        serviceContent.append("\n\n\t");
        serviceContent.append("void update");
        serviceContent.append(className);
        serviceContent.append("(" + className + " entity, String userid, String username);");

        serviceContent.append("\n\n\t");
        serviceContent.append("void update");
        serviceContent.append(className+"CanNull");
        serviceContent.append("(" + className + " entity, String userid, String username);");

        serviceContent.append("\n\n\t");
        serviceContent.append(className + " get" + className + "ByID(long id);");

        serviceContent.append("\n\n\t");
        serviceContent
                .append(className + " get" + tableName + "(" + tableName + "Search search);");

        serviceContent.append("\n\n\t");
        serviceContent.append("List<" + className + "> get" + tableName + "Lists(" + tableName
                + "Search search, Pagination pagination);");

        serviceContent.append("\n\n\t");
        serviceContent.append("PaginationResult<List<" + className + ">> get" + tableName + "s(" + tableName
                + "Search search,Pagination pagination);");

        serviceContent.append("\n");
        serviceContent.append("}");

        String path =destServicePath + "I"+tableName+"Service.java";
        FileWriter wr = new FileWriter(path);
        BufferedWriter writer = new BufferedWriter(wr);
        writer.write(serviceContent.toString());
        writer.flush();
    }
}
