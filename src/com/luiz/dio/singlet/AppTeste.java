package com.luiz.dio.singlet;


import com.luiz.dio.facade.Facade;

public class AppTeste {

	public static void main(String[] args) {
		SingletonSlow singletonSlow = SingletonSlow.instancenewSin();		
		SingletonSlow singletonSlow2 = SingletonSlow.instancenewSin();
		
		System.out.println("1 "+singletonSlow);
		System.out.println("2 "+singletonSlow2);
		
		
		SingletonHurry singletonHurry = SingletonHurry.getInstance();		
		SingletonHurry singletonHurry2 = SingletonHurry.getInstance();
		
		System.out.println("\n\n1 "+ singletonHurry);
		System.out.println("2 "+ singletonHurry2);
		
		SingletonSlowHolder singletonHolder = SingletonSlowHolder.getInstance();		
		SingletonSlowHolder singletonHolder2 = SingletonSlowHolder.getInstance();
		
		System.out.println("\n\n1 "+singletonHolder);
		System.out.println("2 "+singletonHolder2);		

	}

}
