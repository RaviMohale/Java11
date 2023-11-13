package com.java11.ravi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ClassEnhancement {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
			// Class.forName("com.java11.ravi.test");
			
			// write a program to print all the class name present in class including  inner class
		// write a program to print all the class present in HashMap
	   ClassEnhancement c = new ClassEnhancement();
	   c.check();
	}
	
	
	public void check() {
		
		System.out.println(Arrays.toString( ClassEnhancement.class.getNestMembers()));
		System.out.println(Arrays.toString(HashMap.class.getNestMembers()));
		System.out.println(Arrays.toString(ArrayList.class.getNestMembers()));
		System.out.println(A.class.getNestHost());
		System.out.println(D.class.getNestHost());
		System.out.println(A.class.isNestmateOf(ClassEnhancement.class));
		System.out.println(ArrayList.class.isNestmateOf(ClassEnhancement.class));
	}
	static class A{
		
		static class B{
			
		}
	}
	
	static class D{
		
	}

}
