package Day1;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter your user name:");
		 String user=sc.next();
		 
		 System.out.println("Enter your Password:");
		 int password=sc.nextInt();
		 
		 System.out.println("Enter your Phone no.:");
		 String phone=sc.next();
		 
		 if(user.equals("Kaushal") && password==12345 && phone.equals("7417089234"))
		 	{
			 System.out.println("Welcome to Home Page.");
			 
		 	}
			
		 else 
		 	{
			 System.err.println("Sorry! Invalid Username & Password.");
		 	}
		 
		sc.close(); 
	}
}
