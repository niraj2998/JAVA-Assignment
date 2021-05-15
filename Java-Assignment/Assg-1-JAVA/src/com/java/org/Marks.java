package com.java.org;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks of m1");
		int m1=sc.nextInt();
		System.out.println("Enter the Marks of m2");
		int m2=sc.nextInt();
		System.out.println("Enter the Marks of m3");
		int m3=sc.nextInt();
		
		
		if(m1>60&&m2>60&&m3>60)
		{
			
			System.out.println("the student is passed");
			
			
		}
		else if ((m1>60 && m2>60 && m3<60)||(m1>60 && m2<60 && m3>60)||(m1<60 && m2>60 && m3>60) )
		{
			
			
			System.out.println("the student is prmoted");
				
			
			
		}
		else 
		{
			
			
			System.out.println("the student is fail");
			
		}
		
		

	}

}
