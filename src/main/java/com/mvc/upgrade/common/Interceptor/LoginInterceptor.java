package com.mvc.upgrade.common.Interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{
	private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);
	
	//Controller 실행 전에 수행되는 메소드
	//return 값에 따라 false인 경우 controller 실행하지 않고 요청 종료!
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		
		logger.info("[interceptor] : preHandle");
		
		//로그인을 하려고 하는 요청이면 controller로 보내자.
		//로그인 폼에서 아이디, 비번 연결했을때도 넘겨주자.
		//로그인이 되어 있는 경우(로그인 된 상태)
		if(request.getRequestURI().contains("/loginform.do")
		   || request.getRequestURI().contains("/ajaxlogin.do")
		   || request.getSession().getAttribute("login") != null ) {
			
			return true;
			
		}
		
		//로그인을 안했을때
		if(request.getSession().getAttribute("login")==null) {
			response.sendRedirect("loginform.do");
			
			return false;
		}
		return false;
		
	}
	
	
	
	//Controller 실행 후에 수행되는 메소드
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) {
		
		logger.info("[interceptor] : postHandle");
		
		
	}
	
	//view까지 처리 끝난 후 수행되는 메소드
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		
		logger.info("[interceptor] : afterCompletion");
		
	}

}
