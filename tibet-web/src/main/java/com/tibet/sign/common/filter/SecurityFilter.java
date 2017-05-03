package com.tibet.sign.common.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.tibet.sign.common.Application;

/**
 * 
 * @author chunhui.li
 */
public class SecurityFilter implements Filter {

    protected Logger logger = Logger.getLogger(this.getClass());
    private static Map<String, Class> PERM_CLASS = new HashMap<String, Class>();

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession();

        // uri取得
        String uri = request.getRequestURI();
        
        // セッションからユーザはなかった場合、ログイン画面遷移
        if (session.getAttribute(Application.SESSION_KEY_LOGINUSER) == null) {
            
            // ある場合、権限の判断を行う
        } else {
            
        }
        

        if (request != null && session != null) {

            // 画面表示権限チェック
        }
        chain.doFilter(req, res);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
        PERM_CLASS.put("ID", Object.class);
    }

}
