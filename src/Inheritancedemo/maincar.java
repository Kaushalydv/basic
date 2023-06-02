package Inheritancedemo;

public class maincar {

	public static void main(String[] args) {
		
		Car cc=new Car();
		cc.color();
		cc.price();
	
System.out.println("********************************************************************************");
	
		Supercar sc=new Supercar();
		sc.speed();
		sc.wheel();
		sc.color();
		sc.price();
		
System.out.println("********************************************************************************");
	
	Racingcar rc=new Racingcar();
	rc.airbag();
	rc.acceleration();
	rc.color();
	rc.price();
	rc.wheel();
	rc.speed();
	
System.out.println("********************************************************************************");	
	}
}
