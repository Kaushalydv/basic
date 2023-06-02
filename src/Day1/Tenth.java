package Day1;

import java.util.Scanner;

public class Tenth {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Place1:");
	String place1=sc.next();
	
	System.out.println("Enter Place2:");
	String place2=sc.next();
	
	if(place1.equals(place2))
	{
		System.out.println("Welcome! You are the Correct Place.");
	}
	else {
		System.err.println("Sorry! You are Incorrect Place.");
	}
	sc.close();
}
}
