package com.java11.ravi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LocalVariableInferenceStringEnhancement {
	public static void main(String[] args) {

		String s = "Ravi";
		String s1 = "Ravi";
		System.out.println(s); // Ravi
		System.out.println(s + "Hi");// RaviHi
		s1.concat("Hi");
		System.out.println(s1);// Ravi
		s1 = s1.concat("Hi");
		System.out.println(s1);// RaviHi
		s1.repeat(2);

		System.out.println(s1);
		s1 = s1.repeat(2);
		System.out.println(s1);
		// s1.repeat(-4);//java.lang.IllegalArgumentException:
		// System.out.println(s1);

		String r = "Ravi";
		System.out.println(r.repeat(2)); // Ravi Ravi

		System.out.println(r.isBlank());
		System.out.println("".isBlank());
		System.out.println("    ".isBlank());
		//r.repeat(Integer.MAX_VALUE);//java.lang.OutOfMemoryError:
		//System.out.println(r);
		
		String r1 = "  Ravi is teaching  Java ";
		System.out.println(r1.trim()); // leading and trailing space will be remove i.e space before Ravi and space After Java
		System.out.println(r1.strip());
		System.out.println(r1.stripLeading());
		System.out.println(r1.stripTrailing());

		
		System.out.println("*******     Blank method             **********");
		String e="";
		String e1 = "          ";
		
		System.out.println(e.isBlank());
		System.out.println(e1.isBlank());
		System.out.println(e.isEmpty());
		System.out.println(e1.isEmpty());
		
		
		System.out.println("===========   Lines method =================");
		String e3 = "Ravi"+"\n"+"is"+"\n"+"Teaching"+"\r"+"Java";   // \n or \r i line terminator..
		System.out.println(e3);
		System.out.println("   ------------   using lines method     ---------- ");
		e3.lines().forEach(p -> System.out.print(p));
		
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put(s, 101);
		m.put(s1 + "Hi", 102);

		var i = "Ravi";
		var d = 100.00;
		int l1 = 10;
		String s2 = "Ravi";
		var l = new ArrayList<>();

	}

}
