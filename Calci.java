package com.student;

import java.util.Scanner;

public class Calci extends Exception {
	int a;
	int b;

	void POW(int a, int b) throws Myexceptions {
		if (a < 0 || b < 0) {
			throw Myexceptions("\n a and b should be non-negative....");
		} else {
			double p =  Math.pow(a, b);
			System.out.println("\n the value of pow is ..: " + p);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calci st = new Calci();
		Scanner s1 = new Scanner(System.in);
		System.out.println("input 1st number:");
		int a = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("input 2nd number:");
		int b= s2.nextInt();
		st.POW(a, b);
	}

}
