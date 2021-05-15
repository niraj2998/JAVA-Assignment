package com.java.org;
import java.util.Scanner;

public class Income {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the income range");
		int i=sc.nextInt();
		
		
		if(i>=0 && i<=180000)
		{
			
			System.out.println("Nil");
			
			
		}
		else if (i>=180001 && i<=300000 )
		{
			
			
			System.out.println("The tax pay in percentage is 10%");	
			
		}
		else if(i>=300001 && i<=500000)
		{
			
			
			System.out.println("The tax pay in percentage is 20%");	
			
		}
		else if(i>=500001 && i<=1000000)
		{
			
			System.out.println("The tax pay in percentage is 30%");	
		}
		
		

	}

}
