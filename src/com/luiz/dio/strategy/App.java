package com.luiz.dio.strategy;

public class App {

	public static void main(String[] args) {
		
		NormalBehaviour normal = new NormalBehaviour();
		DefensiveBehaviour defensive = new DefensiveBehaviour();
		AggressiveBehaviour aggressiveBehaviour = new AggressiveBehaviour();
		
		Robot robot = new Robot();
		
		robot.setBehaviour(normal);
		
		robot.move();
		robot.move();
		
		robot.setBehaviour(defensive);
		
		robot.move();
		robot.move();
		
		robot.setBehaviour(aggressiveBehaviour);
		
		robot.move();
		robot.move();

	}
}
