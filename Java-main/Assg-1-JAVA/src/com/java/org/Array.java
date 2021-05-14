package com.java.org;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type number");
		int num = scan.nextInt();
		int a[] = { 3, 42, 46, 68, 8, 19, 12, 32, 63, 39, 97, 70, 86, 91, 84 };

		for (int i = 0; i < a.length; i++) {
			if (num == a[i])
				break;
		}

		System.out.println("The Array is " + num);

	}

}
