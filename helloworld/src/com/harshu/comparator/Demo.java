package com.harshu.comparator;

import java.util.ArrayList;
import java.util.Collections;


public class Demo {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(new Student(252,"bbb","bangalore"));
		al.add(new Student (242,"aaa","bangalfdsfore"));
		al.add(new Student (263,"fa","ban"));
		
		Collections.sort(al,new SortbyRoll());
		Collections.sort(al,new SortbyName());
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
	}

