package com.mclin.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ExitAction extends ActionSupport {
	
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		session.removeAttribute("count");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		request.setAttribute("msg", "* 你已成功退出系统！");
		return "exit_success";
		
	}
}
