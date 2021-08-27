package com.example.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ServiceImpl {

        public static void genImpl(String className, String destServiceImplPath) throws IOException {

//            String className = "BillCompanySecRefundEntity";

            String tableName = className.substring(0, className.indexOf("Entity"));

//            String finName = className.substring(className.indexOf("Bill"));
            StringBuffer serviceContent = new StringBuffer();
            serviceContent.append("import com.ibm.framework.dal.util.Pagination;\n");
            serviceContent.append("import com.ibm.framework.dal.util.PaginationResult;\n");
            serviceContent.append("import com.nc.framework.service.AbstractService;\n");
            serviceContent.append("import org.apache.dubbo.config.annotation.Reference;\n");
            serviceContent.append("import org.apache.dubbo.config.annotation.Service;\n");
            serviceContent.append("import java.util.Date;\n");
            serviceContent.append("import java.util.List;\n");
            serviceContent.append("import java.util.Map;\n\n");
            serviceContent.append(
                    "@Service(version = \"1.0.0\", delay = -1, retries = -1, timeout = 60000)\n@org.springframework.stereotype.Service");
            serviceContent.append("\npublic class ");
            serviceContent.append(tableName);
            serviceContent.append("ServiceImpl extends AbstractService implements I");
            serviceContent.append(tableName);
            serviceContent.append("Service { ");
            serviceContent.append("\n\n\t");
            serviceContent.append("@Reference(version = \"1.0.0\")");
            serviceContent.append("\n\t");
            serviceContent.append("private IIdService idService;");

            serviceContent.append("\n\n\t");
            serviceContent.append("@Override");
            serviceContent.append("\n\t");
            serviceContent.append("public void add");
            serviceContent.append(className);
            serviceContent.append("(" + className + " entity, String userid, String username){");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setId(idService.getID());");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setCreateDate(new Date());");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setCreateUserid(userid);");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setCreateUsername(username);");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setActive(CommonStatus.RowStatus.ACTIVE);");
            serviceContent.append("\n\t\t");
            serviceContent.append("dalClient.persist(entity);");
            serviceContent.append("\n\t");
            serviceContent.append("}");

            serviceContent.append("\n\n\t");
            serviceContent.append("@Override");
            serviceContent.append("\n\t");
            serviceContent.append("public void update");
            serviceContent.append(className);
            serviceContent.append("(" + className + " entity, String userid, String username){");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setUpdateDate(new Date());");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setUpdateUserid(userid);");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setUpdateUsername(username);");
            serviceContent.append("\n\t\t");
            serviceContent.append("dalClient.dynamicMerge(entity);");
            serviceContent.append("\n\t");
            serviceContent.append("}");


            serviceContent.append("\n\n\t");
            serviceContent.append("@Override");
            serviceContent.append("\n\t");
            serviceContent.append("public void update");
            serviceContent.append(className+"CanNull");
            serviceContent.append("(" + className + " entity, String userid, String username){");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setUpdateDate(new Date());");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setUpdateUserid(userid);");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setUpdateUsername(username);");
            serviceContent.append("\n\t\t");
            serviceContent.append("Map<String, Object> map = JexlUtil.val2Map(entity);");
            serviceContent.append("\n\t\t");
            serviceContent.append("dalClient.execute(\"" + tableName + ".update" + tableName + "\", map); ");
            serviceContent.append("\n\t");
            serviceContent.append("}");

            serviceContent.append("\n\n\t");
            serviceContent.append("@Override");
            serviceContent.append("\n\t");
            serviceContent.append("public " + className + " get" + className + "ByID(long id){");
            serviceContent.append("\n\t\t");
            serviceContent.append(className + " entity = new " + className + "();");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity.setId(id);");
            serviceContent.append("\n\t\t");
            serviceContent.append("entity = dalClient.find(" + className + ".class, entity);");
            serviceContent.append("\n\t\t");
            serviceContent.append("return entity;");

            serviceContent.append("\n\t");
            serviceContent.append("}");

            serviceContent.append("\n\n\t");
            serviceContent.append("@Override");
            serviceContent.append("\n\t");
            serviceContent.append("public " + className + " get" + tableName + "(" + tableName + "Search search){");
            serviceContent.append("\n\t\t");
            serviceContent.append("List<"+className+"> list = get"+tableName+"Lists(search, new Pagination(-1, 1));");
            serviceContent.append("\n\t\t");
            serviceContent.append("if (list != null && list.size() > 0) {");
            serviceContent.append("\n\t\t\t\t");
            serviceContent.append("return list.get(0);");
            serviceContent.append("\n\t\t");
            serviceContent.append("}");
            serviceContent.append("\n\t\t");
            serviceContent.append("return null;");

            serviceContent.append("\n\t");
            serviceContent.append("}");

            serviceContent.append("\n\n\t");
            serviceContent.append("@Override");
            serviceContent.append("\n\t");
            serviceContent.append("public List<" + className + "> get" + tableName + "Lists(" + tableName
                    + "Search search, Pagination pagination){");

            serviceContent.append("\n\t\t");
            serviceContent.append("PaginationResult<List<"+className+">> p = get"+tableName+"s(search, pagination);");
            serviceContent.append("\n\t\t");
            serviceContent.append("return p.getR();");

            serviceContent.append("\n\t");
            serviceContent.append("}");

            serviceContent.append("\n\n\t");
            serviceContent.append("@Override");
            serviceContent.append("\n\t");
            serviceContent.append("public PaginationResult<List<" + className + ">> get" + tableName + "s(" + tableName
                    + "Search search,Pagination pagination){");
            serviceContent.append("\n\t\t");
            serviceContent.append("return dalClient.queryForList(\"" + tableName + ".get" + tableName + "s\", search, "
                    + className + ".class,pagination);");

            serviceContent.append("\n\t");
            serviceContent.append("}");

            serviceContent.append("\n");
            serviceContent.append("}");
            String path = destServiceImplPath + tableName+"ServiceImpl.java";
            FileWriter wr = new FileWriter(path);
            BufferedWriter writer = new BufferedWriter(wr);
            writer.write(serviceContent.toString());
            writer.flush();
        }



}
