package com.test;

import com.database.dao.UserDAOMapper;
import com.database.entity.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FunctionImpl implements Function{

    @Autowired
    private UserDAOMapper userDAOMapper;

    @Autowired
    private Base base;

    @Override
    public void print(){
//        System.out.println(base.getSubTypeInfoId());
        System.out.println("base");
    }


    @Override
    public void parentTransactional(){
        UserDAO userDAO = new UserDAO();
        userDAO.setId(1L);
        userDAO.setName("zs");
        userDAO.setPhone("131xxxx5678");
        userDAO.setAdress("sh");
        userDAO.setIdcard("610****");
        userDAO.setCreateDate(new Date());
        userDAO.setCreateUsername("zqy");
        userDAOMapper.insertSelective(userDAO);
    }

    @Override
    public void sub1Transactional(){
    }
    @Override
    public void sub2Transactional(){
    }


}
