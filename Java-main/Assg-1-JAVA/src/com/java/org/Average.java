package com.java.org;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		int[] A = new int[3];
		int[] B = new int[3];
		int[] C = new int[3];
		System.out.println("Enter the Marks of 1 student");
		for (int i = 0; i < 3; i++) {
			A[i] = sc.nextInt();
			a = A[i] + a;

		}

		System.out.println("the total marks of student 1 is " + a);
		System.out.println("the averge mark of student 1 is" + (a / 3));

		System.out.println("Enter the Marks of 2nd student");
		for (int i = 0; i < 3; i++) {
			B[i] = sc.nextInt();
			b = B[i] + b;
		}
		System.out.println("the total marks of student 2nd is " + b);
		System.out.println("the averge mark of student 2nd is" + (b / 3));

		System.out.println("Enter the Marks of 3rd student");
		for (int i = 0; i < 3; i++) {
			C[i] = sc.nextInt();
			c = B[i] + c;
		}
		System.out.println("the total marks of student 3rd is " + c);
		System.out.println("the averge mark of student 3rd is" + (c / 3));

		int t1 = A[0] + B[0] + C[0];
		System.out.println("the total marks in sub S1 is " + t1);
		System.out.println("the average maks in sub S1  is " + (t1 / 3));

		int t2 = A[1] + B[1] + C[1];
		System.out.println("the total marks in sub S1 is " + t2);
		System.out.println("the average maks in sub S1  is " + (t2 / 3));

		int t3 = A[2] + B[2] + C[2];
		System.out.println("the total marks in sub S1 is " + t3);
		System.out.println("the average maks in sub S1  is " + (t3 / 3));

	}

}
