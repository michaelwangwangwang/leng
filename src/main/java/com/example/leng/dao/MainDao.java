package com.example.leng.dao;


import com.example.leng.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface MainDao {

    @Select("SELECT * FROM users WHERE username=#{username}")
    User select(String username);

}
