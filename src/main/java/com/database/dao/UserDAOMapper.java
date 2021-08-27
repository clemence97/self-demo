package com.database.dao;

import com.database.entity.UserDAO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDAO record);

    int insertSelective(UserDAO record);

    UserDAO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDAO record);

    int updateByPrimaryKey(UserDAO record);
}