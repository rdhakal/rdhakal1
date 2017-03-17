package com.student;

import java.util.Scanner;

public class Inputname  {
	String s1;
	public static void main(String[] args) {

		Scanner s1= new Scanner(System.in);
		while(true){
		 
			System.out.println("input Your Name:");
		  String a= s1.next();
		  if (a.contentEquals("end")) break;
		  else
		  System.out.println(a+"<>HI");
		  
		  
		}
		  

	}

}
