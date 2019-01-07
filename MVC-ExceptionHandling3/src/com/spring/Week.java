package com.spring;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Week extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request , HttpServletResponse response ,Object handler) throws Exception{
		Calendar c=Calendar.getInstance();
		
		int day=c.get(c.DAY_OF_WEEK);
		System.out.println(day);
		if(day==5){
			response.getWriter().write("Do not Work on friday");
			return false;
		}
		else
			return true;
		
	}
	
	
	//these methods will be called for every request and every web page generated unless dispatcher Servlet is modified and give
	// path for specific url
	
	
	
	
	// this method will be called after call to the controller class method which is handle in this case
	@Override
	public void postHandle(HttpServletRequest request , HttpServletResponse response ,Object handler,ModelAndView model) {
		
		System.out.println("postHandle"+request.getRequestURI());
		
	}
	
	// this method will be called after a web page is displayed or after call to the view and view produces the response
	@Override
	public void afterCompletion(HttpServletRequest request , HttpServletResponse response ,Object handler ,Exception e){

		System.out.println("after Completion"+request.getRequestURI().toString());
		
	}
	

}
