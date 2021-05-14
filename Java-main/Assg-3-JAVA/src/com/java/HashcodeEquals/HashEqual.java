package com.java.HashcodeEquals;

import java.util.HashMap;

public class HashEqual {
	int Groot;

	public HashEqual(int groot) {
		super();
		Groot = groot;
	}

	@Override
	public String toString() {
		return "Employeee [Groot=" + Groot + "]";
	}

	@Override
	public int hashCode() {

		return 2;
	}

	@Override
	public boolean equals(Object obj) {

		return true;
	}

}

class hashmap

{
	public static void main(String[] args) {

		HashEqual a1 = new HashEqual(24);
		HashEqual a2 = new HashEqual(34);

		HashMap<HashEqual, String> h1 = new HashMap<HashEqual, String>();

		h1.put(a1, "Tom");
		h1.put(a2, "Jerry");

		System.out.println(h1);

		System.out.println(h1.get(a2));

	}

}
