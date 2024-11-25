package com.mvc.upgrade.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LogFilter implements Filter {

	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	// filter 초기화
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	//filter 동작부분
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		
		String remoteAddr = "remoteAddr: " +req.getRemoteAddr()+"\n";
		String uri = "uri: " +req.getRequestURI()+"\n";
		String url = "url: "+req.getRequestURL().toString()+"\n";
		String queryString = "queryString: "+req.getQueryString()+"\n";
		
		String referer = "referer: " +req.getHeader("referer")+"\n";
		String agent = "agent: "+req.getHeader("User-Agent")+"\n";
		
		logger.info("LOG FILTER\n"+ remoteAddr+uri+url+queryString+referer+agent);
		
		//filter chain을 이용해서 여러개의 필터들이 연결돼있음.
		chain.doFilter(req, response);
		
	}

	//filter 객체가 종료될때 사용됨
	@Override
	public void destroy() {
		
	}
	
	

}
