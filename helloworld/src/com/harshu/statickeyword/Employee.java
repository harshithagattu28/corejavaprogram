package com.harshu.statickeyword;
// static keyword to variables
public class Employee {
	
	int eid;
	String name;
	static String company="harshu"; //static
			
			
	Employee(int r,String n) {
		eid=r;
		name=n;
	}
	void display() {
		System.out.println(eid+" "+name+" "+company);
	}
}
