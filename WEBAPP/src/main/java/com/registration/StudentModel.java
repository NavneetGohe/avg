package com.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentModel {
	public void add(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement(" INSERT INTO student values (?,?,?,?)");
		ps.setString(1, bean.getRollno());
		ps.setString(2, bean.getFirstname());
		ps.setString(3, bean.getLastname());
		ps.setString(4, bean.getSession());
		ps.executeUpdate();
		conn.commit();

	}

	public void modify(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn
				.prepareStatement("UPDATE student SET  firstname=?, lastname=?, session=? WHERE rollno=? ");
		ps.setString(1, bean.getFirstname());
		ps.setString(2, bean.getLastname());
		ps.setString(3, bean.getSession());
		ps.setString(4, bean.getRollno());
		ps.executeUpdate();
		conn.commit();
	}

	public void delete(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("Delete from student where rollno=?");
		ps.setString(1, bean.getRollno());
		ps.executeUpdate();
		conn.commit();
	}

	public StudentBean get(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("Select * from student where rollno=?");
		ps.setString(1, bean.getRollno());
		ResultSet rs= ps.executeQuery();
		StudentBean sb=null;
		while (rs.next()) {
			sb = new StudentBean();
			bean.setRollno(rs.getString(1));
			bean.setFirstname(rs.getString(2));
			bean.setLastname(rs.getString(3));
			bean.setSession(rs.getString(4));
			
		}
return sb;
	}
	public static List<StudentBean> search(StudentBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("Select* from student");
		ResultSet rs= ps.executeQuery();
		StudentBean bean1=null;
		List<StudentBean> list1=new ArrayList<StudentBean>();
		while (rs.next()) {
			bean1=new StudentBean();
			bean1.setRollno(rs.getString(1));
			bean1.setFirstname(rs.getString(2));
			bean1.setLastname(rs.getString(3));
			bean1.setSession(rs.getString(4));
			list1.add(bean1);
		}
		conn.commit();
		return list1;
		
	}
}
