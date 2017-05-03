package com.tibet.sign.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tibet.sign.common.message.SpringMessageResourceMessages;
import com.tibet.sign.domain.SignUpSerialNumber;
import com.tibet.sign.form.LoginForm;
import com.tibet.sign.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
    private static Log logger = LogFactory.getLog(LoginController.class);

    private static String loginScreen = "user/login";

    private static String signupcreen = "signup/insert";

    @Autowired
    private SpringMessageResourceMessages messageSource;


    @Autowired
    private LoginService signInService;

    @RequestMapping("/")
    String home(@ModelAttribute("form") @Valid LoginForm loginForm) {
        return loginScreen;
    }

    @RequestMapping("/index")
    String index(@ModelAttribute("form") @Valid LoginForm loginForm) {
        return loginScreen;
    }

    /**
     * @param form
     * @param result
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("form") @Valid LoginForm form, BindingResult result, Model uiModel) {

        String serialNumber = form.getSerialNumber();

        // execute Authentication
        SignUpSerialNumber signUpSerialNumber = signInService.authenticate(serialNumber);
        if (signUpSerialNumber == null) {
            logger.info("Authentication : Failure");
            // message setting
            uiModel.addAttribute("error", messageSource.getMessage("P0001"));
            return loginScreen;
        }
        
        // execute Authorization role
        return signupcreen;
    }

}
