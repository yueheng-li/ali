package com.tibet.sign.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.tibet.sign.domain.SignUpSerialNumber;


@Mapper
public interface SignUpSerialNumberMapper {
    SignUpSerialNumber selectSignUpSerialNumberBynumber(@Param("serial_number")String serialNumber);
}

