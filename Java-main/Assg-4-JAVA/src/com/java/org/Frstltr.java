package com.java.org;

import java.util.ArrayList;
import java.util.Arrays;

public class Frstltr {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		Arrays.asList("Hulk","Tom","jerry","thor")
		.forEach(n->sb.append(n.charAt(0)));
		
		System.out.println(sb);
		
	}

}
