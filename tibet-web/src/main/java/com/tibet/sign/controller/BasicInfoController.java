package com.tibet.sign.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tibet.sign.common.message.SpringMessageResourceMessages;
import com.tibet.sign.form.BasicInfoForm;
import com.tibet.sign.service.LoginService;

@Controller
@RequestMapping("/signup")
public class BasicInfoController {
    private static Log logger = LogFactory.getLog(BasicInfoController.class);

    private static String signupcreen = "signup/insert";

    @Autowired
    private SpringMessageResourceMessages messageSource;


    @Autowired
    private LoginService signInService;


    @RequestMapping("/index")
    String index(@ModelAttribute("form") @Valid BasicInfoForm info) {
        return signupcreen;
    }
}
