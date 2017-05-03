package com.tibet.sign.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.tibet.sign.domain.User;

@Mapper
public interface UserMapper {
    User selectByNameAndPassword(@Param("name")String name, @Param("password")String password);
}
