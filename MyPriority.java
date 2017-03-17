package com.student;

class MyPriority extends Thread {

	public void run() {
		System.out.println("\nMy Running thread name is :" + Thread.currentThread().getName());
		System.out.println("\nMy Running thread priority is:" + Thread.currentThread().getPriority());

	}

}

public class ThreadPriority {

	public static void main(String[] s) {

		MyPriority m1 = new MyPriority();
		MyPriority m2 = new MyPriority();
		m1.setPriority(Thread.MAX_PRIORITY);
		m2.setPriority(Thread.MIN_PRIORITY);

		m1.start();
		m2.start();

	}

}