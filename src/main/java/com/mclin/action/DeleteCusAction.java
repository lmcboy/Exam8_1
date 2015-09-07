package com.mclin.action;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.mclin.util.ConnectionFactory;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCusAction extends ActionSupport{

	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String execute() throws Exception {
		Connection conn = (Connection) ConnectionFactory.newInstance().makeConnection();
		String sql = "UPDATE customer SET active = 0 WHERE customer_id = " + id;
		HttpServletResponse response = ServletActionContext.getResponse();
		try {
			Statement st = (Statement) conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
