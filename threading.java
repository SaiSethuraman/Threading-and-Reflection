package com.poctoday;

public class threading extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

}

class end{
	
	public static void main(String[] args) {
		
		threading t1 = new threading();
		threading t2 = new threading();
		threading t3 = new threading();
		
		t1.setName("Welcome");
		t2.setName("Sai");
		t3.setName("Sethuraman");
		
		t1.setPriority(2); //(Thread.MIN_PRIORITY) //---> minimum priority
		t2.setPriority(6); //(Thread.NORM_PRIORITY) //---> normal priority
		t3.setPriority(8); //(Thread.MAX_PRIORITY) //---> maximum priority
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

//so when the program is run the output would be
//Sethuraman
//8
//Sai
//6
//Welcome
//2
