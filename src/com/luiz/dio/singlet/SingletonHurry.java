package com.luiz.dio.singlet;
/**
 * Singleton EAGER
 * @author Luiz
 *
 */
public class SingletonHurry {
	
	private static SingletonHurry myeagerInstance = new SingletonHurry();
	private String name = "SingletonHurry";
	//private static int counter=0;
	
	private SingletonHurry() {
		super();
		//counter++;
	}
	
	public static SingletonHurry getInstance() {
		return myeagerInstance;
	}

	/*
	 * @Override public String toString() { return "SingletonHurry [name=" + name +
	 * "]"; }
	 */
	
	
}
