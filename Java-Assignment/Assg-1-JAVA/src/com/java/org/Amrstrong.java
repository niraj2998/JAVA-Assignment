package com.java.org;

import java.util.Scanner;

public class Amrstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int i = scan.nextInt();
		int p = i;
		int q = 0;
		int r = 0;

		while (i != 0) {
			q = i % 10;
			r = r + (q * q * q);
			i = i / 10;
		}

		if (r == p)
			System.out.println("Number is Amstrong");
		else
			System.out.println("Number is not Amstrong");

	}

}
