package com.mclin.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static final ConnectionFactory factory = new ConnectionFactory();
	private Connection conn;
	private static String driver;
	private static String url;
	private static String user;
	private static String pswd;
	
	private ConnectionFactory(){}
	
	static{
		Properties prop = new Properties();
		try {
			InputStream is = ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("dbconfig.properties");//获得properties文件的字节流
			prop.load(is);//导入到Properties对象中
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("======配置文件读取失败======");
		}
		//开始读取文件内容
		driver = prop.getProperty("driver");
		url = prop.getProperty("url");
		user = prop.getProperty("user");
		pswd = prop.getProperty("pswd");
	}
	
	public static ConnectionFactory newInstance(){
		return factory;
	}
	
	public Connection makeConnection(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pswd);//加载驱动
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
