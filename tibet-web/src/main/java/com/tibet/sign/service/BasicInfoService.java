package com.tibet.sign.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tibet.sign.domain.SignUpSerialNumber;
import com.tibet.sign.mapper.SignUpSerialNumberMapper;

@Component
public class BasicInfoService {
    private static Log logger = LogFactory.getLog(LoginService.class);
    @Autowired
    private SignUpSerialNumberMapper signUpSerialNumberMapper;
    
    public SignUpSerialNumber authenticate(String serialNumber) {
        
    	SignUpSerialNumber signUpSerialNumber = signUpSerialNumberMapper.selectSignUpSerialNumberBynumber(serialNumber);

        if (signUpSerialNumber != null) {
            logger.info("signUpSerialNumber >>>>" + signUpSerialNumber.toString());
        }
        
        return signUpSerialNumber;
    }

}
