package inheritancedemo1;

import java.util.Scanner;

public class Employee {
	Scanner sc=new Scanner(System.in);
	
	
		//local method
	public void Name() {
		System.out.println("Enter Employee name:");
		String name=sc.next();
		System.out.println("The name of Employee is = "+name);
	}
	
	public void Dept() {
		System.out.println("Enter Department name: ");
		String dept=sc.next();
		System.out.println("The Department is = "+dept);
	}
	public void Floor() {
		System.out.println("Enter Floor:");
		int floor=sc.nextInt();
		System.out.println("The Floor is = "+floor);
		
	}
	
}
