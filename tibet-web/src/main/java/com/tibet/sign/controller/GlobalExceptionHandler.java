package com.tibet.sign.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 共通異常処理
 * 
 * @author chunhui.li
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IOException.class)
    public ModelAndView myError(Exception exception) {
        System.out.println("----Caught IOException----");
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", exception);
        mav.setViewName("globalerror");
        return mav;
    }

    /**
     * Exceptionが発生する場合、error画面へ遷移
     * @return
     */
    @ExceptionHandler(Exception.class)
    public String error() {
        return "errorpage/error";
    }
}
