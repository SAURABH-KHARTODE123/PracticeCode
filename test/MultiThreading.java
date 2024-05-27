package com.demo.test;

public abstract class MultiThreading implements Runnable {

	public static void main(String[] args) {
		for(int i=0; i<10;i++)
		{
			Thread t=new Thread();
			t.start();
			System.out.println("Thread1 is running");
			
			
			Thread t1=new Thread(new Thread());
			t1.start();
			System.out.println("Thread2 is running");
			
		}
	}

}
