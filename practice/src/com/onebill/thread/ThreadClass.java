package com.onebill.thread;

public class ThreadClass extends Thread {

	int max;
	
	public ThreadClass(int max) {
		this.max = max;
	}
	
	@Override
	public void run() {
		while(max > 0) {
			if(max % 2 == 0) {
				System.out.println(max);
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {}
			}
			max--;
		}
	}
	
	public static void main(String[] args) {
		
		ThreadClass tc = new ThreadClass(10);
		tc.start();
		ThreadClass tc1 = new ThreadClass(20);
		tc1.start();
		
	}
}
