package com.spring;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Week extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request , HttpServletResponse response ,Object handler) throws Exception{
		Calendar c=Calendar.getInstance();
		
		int day=c.get(c.DAY_OF_WEEK);
		if(day==5){
			response.getWriter().write("Do not Work on Sunday");
			return false;
		}
		else
			return true;
		
	}
	
	
	

}
