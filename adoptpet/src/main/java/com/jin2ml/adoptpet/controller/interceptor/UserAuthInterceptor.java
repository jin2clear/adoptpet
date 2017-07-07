package com.jin2ml.adoptpet.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.jin2ml.adoptpet.model.User;
import com.jin2ml.adoptpet.service.UserService;

/**
 * 用户权限拦截
 * @author jin2ml
 *
 */
public class UserAuthInterceptor extends HandlerInterceptorAdapter
{
	@Autowired
	UserService userService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		User user = new User();
		if(request.getSession().getAttribute("UserId") != null){
			user.setId(Integer.parseInt(request.getSession().getAttribute("UserId").toString()));
			User temp = userService.getUser(user);
			if(null != temp){
				return true;
			}
		}
		response.setCharacterEncoding("utf-8");
		response.sendRedirect("/user/login");
		return false;
	}
	
}
