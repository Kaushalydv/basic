package Day2;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Your Name:");	
	 String name=sc.next();
	 
	for(int i=1; i<=10; i++)
	{
		System.out.println(name);
		
	}
		
	sc.close();	
		
	}

}
