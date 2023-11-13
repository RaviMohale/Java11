package com.java11.ravi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;



public class FileAPIChanges {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		/*
		 * FileInputStream fi = new FileInputStream(
		 * "C:\\Users\\Ravi\\OneDrive\\Desktop\\Ravi\\acknowledege_mail.txt");
		 * ObjectInputStream obj = new ObjectInputStream(fi);
		 * System.out.println(obj.readObject());
		 */
	
		
		  BufferedReader bf = new BufferedReader(new
		  FileReader("D:\\AshokIT\\application properties.txt")); String s = null;
		  while((s = bf.readLine()) != null ) { System.out.println(s); }
		 
	
	
	Path p = Path.of("D:\\\\AshokIT\\\\application properties.txt");
	System.out.println(Files.readString(p));
	
	
	Files.writeString(p, " \n Teaching a Java 11 ", StandardOpenOption.APPEND); //  \n new line 
	System.out.println(Files.readString(p));
	
	Path p1 = Path.of("D:\\\\AshokIT\\\\Test2.txt");
	
	Files.writeString(p1, " \n This is Ravi saying Hello ", StandardOpenOption.CREATE_NEW); //  \n new line 
	System.out.println(Files.readString(p1));
	
	Files.writeString(p1, " \n Using Truncate method.. ", StandardOpenOption.TRUNCATE_EXISTING);  // Truncate for existing content is overridden
	}
}
