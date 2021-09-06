 package com.registration;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;

import org.apache.catalina.startup.PasswdUserDatabase;

public class RegistrationModel {
	
	public int Nextpk() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");
		int i = 0;
		PreparedStatement pd = conn.prepareStatement("select max(id) from user_registration");
		ResultSet rs = pd.executeQuery();
		while (rs.next()) {
			i = rs.getInt(1);

		}
		return i + 1;

	}
	
	public void testAdd(RegistrationBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement(" INSERT INTO user_registration values (?,?,?,?,?,?,?)");
        ps.setInt(1, Nextpk());
		ps.setString(2, bean.getFirst_name());
		ps.setString(3, bean.getLast_name());
		ps.setString(4, bean.getLoginid());
	    ps.setString(5, bean.getPassword());
	    ps.setString(6, bean.getGender());
	    ps.setLong(7, bean.getContact());
		ps.executeUpdate();

		conn.commit();
		
		System.out.println("DONE DONE DONE");
		
		ps.close();
	        	conn.close();

	}
	public RegistrationBean Testauthentication(String loginid, String password) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");


		PreparedStatement ps = (PreparedStatement) conn.prepareStatement("select first_name, last_name,login_id, password,gender,contact from user_registration where login_id=? and password = ?");
		
		ps.setString(1, loginid );
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
	
     RegistrationBean bean = null;
     
     while (rs.next()) {
     
     bean = new RegistrationBean();
     bean.setFirst_name(rs.getString(1));
     bean.setLast_name(rs.getString(2));
     bean.setLoginid(rs.getString(3));
     bean.setPassword(rs.getString(4));
     bean.setGender(rs.getString(5));
     bean.setContact(rs.getLong(6));
     
     }
     
     return bean;
     
     }
	public RegistrationBean testforget(String password) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps =conn.prepareStatement(" select password from user_registration where login_id = ?");
		ps.setString(1, password);
		ResultSet rs =  ps.executeQuery();
		RegistrationBean bean = null;
		while (rs.next()) {
			bean = new RegistrationBean();
			bean.setPassword(rs.getString(1));
		}
		return bean;
		
}
	public RegistrationBean TestChangePassword(String password,int id) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root");

		conn.setAutoCommit(false);

		PreparedStatement ps =conn.prepareStatement("  update user_registration set password=? where id = ?");
		
		
		//RegistrationBean bean = new RegistrationBean();
		ps.setString(1, password);
		ps.setInt(2, id);
		
		ps.executeUpdate();
		ps.close();
		
		conn.commit();
		return null;
		
	
		

}
}
