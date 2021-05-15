package com.java.org;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Uppercase {

	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<>();

		n.add("Hulk");
		n.add("Tom");
		n.add("Jerry");
		n.add("Spidy");
		n.add("Groot");
		n.add("Thor");
		n.replaceAll(t -> t.toUpperCase());

		System.out.println(n);

	}

}
