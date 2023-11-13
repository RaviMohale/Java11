package com.java11.ravi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateChange {
	
	public static void main(String[] args) {
		List<String>  strList = Arrays.asList("","\t","one","two","Three","   "," " );
		// write a stream program to create a blank stream or List of Blank Stream....
		List<String> emptyList = strList.stream().filter(p -> p.isBlank()).collect(Collectors.toList());
		System.out.println(emptyList);
	// write a program to print the no blank stream.....
		
		List<String> nonemptyList = strList.stream().filter(p -> !p.isBlank()).collect(Collectors.toList());
		System.out.println(nonemptyList);
		
		// write a program to print the blank stream... .. using predicate Not Method
		
		List<String> predicateNotMethod = strList.stream().filter(Predicate.not(p -> !p.isBlank())).collect(Collectors.toList());
		System.out.println(predicateNotMethod);
		
		// write a program to print the not blank stream... .. using predicate Not Method
		
		List<String> predicateNotMethod1 = strList.stream().filter(Predicate.not(p -> p.isBlank())).collect(Collectors.toList());
		System.out.println(predicateNotMethod1);
	}
}
