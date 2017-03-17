
package com.student;

class Even extends Thread {

	public void run() {

		for (int i = 0; i < 20; i++) {

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i % 2 == 0)
				;
			else
				System.out.println("             " + i); //

		}
	}
}
