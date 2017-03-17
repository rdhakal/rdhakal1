package com.student;

public class InverseArray {
	static int a[] = { 10, 20, 30, 40, 50 };
	// int b;

	public static void main(String[] args) {

		for (int i = 0; i < a.length / 2; i++) {
			int b;

			b = a[i];
			a[i] = a[a.length - i - 1];

			a[a.length - 1 - i] = b;
			
		}
		
		
		for(int i=0;i<a.length;i++){
			
			System.out.println(a[i]);
			
			
			
		}
	}
}
