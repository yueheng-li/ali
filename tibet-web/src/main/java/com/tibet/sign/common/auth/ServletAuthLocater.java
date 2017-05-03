package com.tibet.sign.common.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.util.StringUtils;

import com.tibet.sign.common.Application;

public class ServletAuthLocater {
	
	private static HttpServletRequest request;
	
	public ServletAuthLocater(HttpServletRequest request) {
		this.request = request;
		
	}
	
	public void saveLoginInfo(String serialNumber) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.setAttribute(Application.SESSION_KEY_LOGINUSER, serialNumber);
		}
	}
	
	public boolean isLogin() {
		HttpSession session = request.getSession(false);
		if (session == null) {
			return false;
		} else {
			String serialNumber = (String) session.getAttribute(Application.SESSION_KEY_LOGINUSER);
			if (StringUtils.isEmpty(serialNumber)) {
				return false;
			}
		}
		return true;
	}

}
