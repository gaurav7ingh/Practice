package com.gaurav;

public class ThreadTry {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			long product = 1;
			for (int i = 1; i <= 10; i++) {
				product *= i;
			}
			System.out.println(product);
			
		});

		Thread t2 = new Thread(() -> {
			try {
				t1.wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		});

		t2.start();
		t1.start();
	}
}
