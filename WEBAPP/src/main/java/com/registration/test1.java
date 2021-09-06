package com.registration;

public class test1 {
public static void main(String[] args) throws Exception {
	
	
	StudentBean sb = new StudentBean();
	sb.setRollno("101");
	
	StudentModel  sm = new StudentModel();
	sm.get(sb);
	
	
	System.out.println(sb.getFirstname() + sb.getLastname());
<<<<<<< HEAD
	System.out.println("hello world");
=======
	
	// sdkhjadkh
>>>>>>> 436e0e712fde7f5c61fdaa94a35213da45f91f0e
}
}
