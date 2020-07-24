package com.cos.blog.config.aop;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.cos.blog.model.User;

// 인증만 관리 /메모리에 띄울 필요없어. 내가 직접 new할거라서.
public class SessionIntercepter extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		User principal = (User)session.getAttribute("principal");
		if(principal == null) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out =  response.getWriter();
			out.print("<script>");
			out.print("alert('로그인이 필요합니다.');");
			out.print("location.href='/auth/loginForm';");
			out.print("</script>");
					
			return false; // 더이상 진입안됨. 바로 response 됨.
		}
	
		System.out.println("인증을 체크 해야함");
		return true;
	}
}
