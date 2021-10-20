package com.poctoday;

public class Display {
	
	private String str;
	
	public Display() {   //Constructor with class name - Display 
		
		str = "Hello All!!";
	}
	
	public void meth1() {
		System.out.println("The String inside method 1 is " + str);
	}
	public void meth2(int n) {
		System.out.println("The number inside method 2 is " + n);
	}
	private void meth3() {
		System.out.println("A Private method is invoked");
	}

}
