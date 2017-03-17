package com.student;

import java.lang.reflect.Array;

public class Arrays {
	static int a[] = { 30, 20, 10, 40, 50 };

	public static void main(String[] args) {

		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
			
		}
		// System.out.println("smallest number is "+a[0]);
		
		
		findSmallLArge();

	}
	
	
	static void  findSmallLArge(){
		int small =a[0];
		int large =a[0];
		int sum;
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]>large)  large = a[i];
			else if(a[i]<small)  small = a[i];
			
			
			
		}//System.out.println("\n"+large+" "+small);
		sum=calcSum();
		System.out.print("\n "+(sum-large)+" ");
		System.out.print(sum-small);
		
		
		
		
	}
	static int calcSum(){
		
		int sum = 0;
		
		for(int i = 0; i<a.length;i++){
			
			sum= sum+a[i];
			
		}
		return sum;
		
		
		
		
	}
	
	
	
	

}
