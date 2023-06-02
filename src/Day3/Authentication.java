package Day3;

import java.util.Scanner;

public class Authentication {
	Scanner sc=new Scanner(System.in);
	
	String user;
	int password;
	
	//Normal method
	public void auth() {
			
	System.out.println("Enter User Name:=");
		user=sc.next();
		
	System.out.println("Enter Password:=");
		password=sc.nextInt();
		
	if(user.equals("Kaushal") && password==12345){
		System.out.println("Welcome Home Page.");
	}
	
	else if(user.equals("Karan") && password==12345){
		System.out.println("Welcome Home Page.");
	}
			
	else if(user.equals("Aniket") && password==12345){
		System.out.println("Welcome Home Page.");
	}
	
	else if(user.equals("Manish") && password==12345){
		System.out.println("Welcome Home Page.");
	}
			
	else if(user.equals("Abdul") && password==12345){
		System.out.println("Welcome Home Page.");
	}
			
	else {
		System.err.println("Sorry! Invalid Credentials.");
	}
	}
}
    	

