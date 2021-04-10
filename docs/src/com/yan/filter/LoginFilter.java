package com.yan.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request1  = (HttpServletRequest) request;     
		String url = request1.getRequestURI();
		if(url.indexOf("login") > -1||url.indexOf("err") > -1||url.indexOf("loginOut")>-1){
			chain.doFilter(request , response );
		}else if(url.contains(".css") || url.contains(".js") || url.contains(".png") || url.contains(".jpg") || url.contains(".gif")){
			//let go if it is css or js
			chain.doFilter(request , response );
		}else{
			chain.doFilter(request , response );
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
