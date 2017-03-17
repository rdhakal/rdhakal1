package com.student;

public class InnerClass {
	

	    public int x = 100;

	    class First {

	      public int x = 200;

	        void methodInFirst(int x) {
	            System.out.println("1st public class value of x = " + x);
	            System.out.println("2nd nested class value of x = " + this.x);
	            System.out.println("3rd method value of x= " + InnerClass.this.x);
	        }
	    }

	    public static void main(String... args) {
	    	
	    	InnerClass st = new InnerClass();
	    	InnerClass.First fl = st.new First();
	        fl.methodInFirst(300);
	    }
	}
	
	

