package com;
class MyThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread()+" is running");
	}
}
public class ThreadExtending {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName());
		/*
		 * MyThread thread1= new MyThread(); thread1.setName("rabbit"); MyThread
		 * thread2= new MyThread(); thread2.setName("tortoise"); thread1.start();
		 * thread2.start();
		 */
		MyThread obj= new MyThread();
		obj.run();
	}

}
