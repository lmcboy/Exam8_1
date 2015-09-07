package com.mclin.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.mclin.util.ConnectionFactory;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String execute() throws Exception {
		if(username == null || password == null){
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("msg", "*请先登录之后再访问！");
			return "login_permission";
		}
		Connection conn = ConnectionFactory.newInstance().makeConnection();
		String sql = "SELECT * FROM customer WHERE first_name = ? AND last_name = ?";
		HttpServletRequest request = ServletActionContext.getRequest();
		try {
			PreparedStatement ps = conn.prepareCall(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){//用户名和密码验证通过
				request.getSession().setAttribute("user", username);
				request.removeAttribute("msg");
			}else{
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				request.setAttribute("msg", "* 用户名或密码错误，请重新登录！");
				return "login_fail";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return "login_fail";
		}
		return "login_success";
	}
	
}
