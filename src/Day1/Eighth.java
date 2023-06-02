package Day1;

import java.util.Scanner;

public class Eighth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			 
			System.out.println("Enter your user name:");
			 String user=sc.next();
			 
			 System.out.println("Enter your Password:");
			 int password=sc.nextInt();
			 
			 
			 if(user.equals("Kaushal") && password==12345)
				 {
				 System.out.println("User name & Password is correct.");
				 }
			 
			 else if(user.equals("Karan") && password==23456)
			 	{
				 System.out.println("User name & Password is correct.");
				 }
				
			 else if(user.equals("Aniket") && password==34567) 
			 	{
				 	System.out.println("User name & Password is correct.");
				 }
			 
			 else 
			 	{
				 
				 System.err.println("Sorry! Invalid Username & Password.");
			 	}
			 
			sc.close(); 
		}
	
	}


