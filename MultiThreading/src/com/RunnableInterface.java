package com;

class MyThread1 implements Runnable {

	public void printMessage(String name) {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " IS RUNNING");
				// t1.interrupt();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("error");
				}
			}
		}
		System.out.println("end of this method");
	}

	@Override
	public void run() {
		printMessage(Thread.currentThread().getName());

	}

}

public class RunnableInterface {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 obj1 = new MyThread1();
		MyThread1 obj2 = new MyThread1();
		MyThread1 obj3 = new MyThread1();
		MyThread1 obj4 = new MyThread1();

		Thread t1 = new Thread(obj1, "1");
		Thread t2 = new Thread(obj2, "2");
		Thread t3 = new Thread(obj3, "3");
		Thread t4 = new Thread(obj4, "4");

//		t1.interrupt(); 
//		t2.interrupt(); 
//		t3.interrupt(); 
//		t4.interrupt();

//		t1.setPriority(Thread.NORM_PRIORITY-2);
//		t2.setPriority(Thread.MIN_PRIORITY);
//		t3.setPriority(Thread.MAX_PRIORITY-3);
		t1.start();
		t2.start();
		// t1.join();
		t3.start();
		t4.start();

	}

}
