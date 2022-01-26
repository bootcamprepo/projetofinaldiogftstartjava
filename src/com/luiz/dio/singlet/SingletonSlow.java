package com.luiz.dio.singlet;

/**
 * Singleton Lazy
 * @author Luiz
 *
 */

public class SingletonSlow {
	
	private static SingletonSlow myInstance;
	
	private String name = "SingletonSlow";
	//private static int counter=0;
	private SingletonSlow() {
		super();
		//counter++;
	}
	
	public static SingletonSlow instancenewSin() {
		if(myInstance==null) {
			myInstance = new SingletonSlow();			
		}
		return myInstance;
	}

	/*
	 * @Override public String toString() { return "SingletonSlow [name=" + name +
	 * "]"; }
	 */
	
	
}
