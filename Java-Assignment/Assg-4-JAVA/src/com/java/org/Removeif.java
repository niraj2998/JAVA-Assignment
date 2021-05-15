package com.java.org;

import java.util.ArrayList;

public class Removeif {

	public static void main(String[] args) {
		
	
	ArrayList<String>n=new ArrayList<String>();
	
	n.add("Hulk");
	n.add("Tom");
	n.add("Jerry");
	n.add("Spidy");
	n.add("Groot");
	n.add("Thor");
	
	System.out.println(n);
	
	n.removeIf(t->(t.length()%2==1));
	System.out.println(n);
	
//	 na.stream()
//	.filter(p->(p.length()%2==1))
//	.forEach(p->System.out.println("\n"+p));

	
	}
	
}
