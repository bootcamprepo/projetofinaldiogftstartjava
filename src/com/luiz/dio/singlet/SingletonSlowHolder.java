package com.luiz.dio.singlet;
/**
 * Singleton EAGER
 * @author Luiz
 *
 */
public class SingletonSlowHolder {
	
	private static class InstanceHolder {
		public static SingletonSlowHolder myeagerInstance = new SingletonSlowHolder();
	}
	
	private String name = "SingletonSlowHolder";
	
	//private static int counter=0;
	
	private SingletonSlowHolder() {
		super();
		//counter++;
	}
	
	public static SingletonSlowHolder getInstance() {
		return InstanceHolder.myeagerInstance;
	}

	/*
	 * @Override public String toString() { return "SingletonSlowHolder [name=" +
	 * name + "]"; }
	 */
	
	
}
