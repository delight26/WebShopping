package com.webshopping.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webshopping.controller.CommandAction;
import com.webshopping.controller.ViewInfo;

public class WebShoppingPageService implements CommandAction {

	@Override
	public ViewInfo requestProc(HttpServletRequest request, HttpServletResponse response, ViewInfo view)
			throws IOException, ServletException {
		switch(view.getReqURI()){
		case "index.do":
			view.setView("/WEB-INF/Main/MainTempIndex.jsp");
			view.setRedirect(false);
			break;
		case "loginpage.do":
			view.setView("/WEB-INF/Member/LoginForm.jsp");
			view.setRedirect(false);
			break;
		}
		return view;
	}
}
