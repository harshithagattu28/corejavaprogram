package com.harshu.sacnnerprogram;
import java.util.Scanner;
import com.harshu.sacnnerprogram.ClassPerson.Person;
public class ClassPersonexce {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter person name");
		String n=sc.nextLine();
		System.out.println("enter the income");
		int i=sc.nextInt();
		
		// object creation
		Person P1=new classPerson();
		P1.setName(n);
		P1.setIncome(i);
		taxcal c=new taxcal();
		
		c.caluculatetax(P1);
		System.out.println("after calucation");
		System.out.println(P1);
	}
	}




