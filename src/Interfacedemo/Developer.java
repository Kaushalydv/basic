package Interfacedemo;

import java.util.Scanner;

public class Developer implements Client {

	String name;
	int password;
	
	
	@Override
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		name=sc.next();	
		
		System.out.println("Enter Password:");
		password=sc.nextInt();
	
		sc.close();			
	}

	@Override
	public void output() {
		if(name.equals("Kaushal") && password==12345 )
			{
			System.out.println("User is successfully Login.");
			}
		
		else {
			System.err.println("Invalid Username & Password.");
		
			}
	}
}
