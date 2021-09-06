package com.registration;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class RegistrationTest {
	public static void main(String[] args) throws Exception {
		//Testauthentication();
		TestChangePassword();
		
		
	}

	private static void TestChangePassword() throws Exception {

		
		//RegistrationBean bean = new RegistrationBean();
				
				RegistrationModel rm = new RegistrationModel();
				rm.TestChangePassword("2354", 12);
				System.out.println("done");
		
	}

	private static void Testauthentication() throws Exception {
		RegistrationBean bean = new RegistrationBean();
		
		RegistrationModel rm = new RegistrationModel();
		bean=rm.Testauthentication("navneet.gohe@gmail.com", "12345" );
		
		if(bean==null) {
			System.out.println("invalid user or password");
		}else {
			System.out.println("Valid User or password");
		}
		
	}

	    
     
     
     
     
     
    
     
	}

