package com.java.org;
import java.util.Scanner;
public class CiSi {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Prin");
		double prin=sc.nextDouble();
		System.out.println("Enter the rate");
		double rate=sc.nextDouble();
		System.out.println("Enter the time");
		double time=sc.nextDouble();
		System.out.println("Enter number of times interest is compunded");
		double timeperiod=sc.nextDouble();
		
		double si= ((prin*rate*time)/100);
		double ci= prin*(Math.pow((1+rate/100),(time*timeperiod)))-prin;
		
		
		
		System.out.println("the simple intrest is"+ si);
		System.out.println("the compund intrest is"+ci);
	

	}

}
