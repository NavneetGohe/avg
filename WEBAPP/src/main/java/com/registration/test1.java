package com.registration;

public class test1 {
public static void main(String[] args) throws Exception {
	
	
	StudentBean sb = new StudentBean();
	sb.setRollno("101");
	
	StudentModel  sm = new StudentModel();
	sm.get(sb);
	
	
	System.out.println(sb.getFirstname() + sb.getLastname());
	
	// sdkhjadkh
}
}
