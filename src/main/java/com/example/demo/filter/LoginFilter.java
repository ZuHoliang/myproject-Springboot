package com.example.demo.filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/api/*"}) //需要登入才能訪問的網頁
public class LoginFilter extends HttpFilter {
	
	@Override
	protected void doFilter(HttpServletRequest request,HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//檢查session中是否有userCert
		HttpSession session = request.getSession();
		if(session.getAttribute("userCert") == null) {
			response.sendRedirect("/login"); //重導回登入頁
			return;
		}
		//有userCert則通過
		chain.doFilter(request, response);
	}

}
