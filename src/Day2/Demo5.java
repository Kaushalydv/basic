package Day2;

import java.util.Scanner;

public class Demo5 {
	
	//static method1
	public static void Run() {
	
	System.out.println("This is static method.");
	
	}
	
	
	//static method2
	public static void Authentication() {
	Scanner sc=new Scanner(System.in);	
	
	System.out.println("Enter User Name:=");
		String user=sc.next();
	System.out.println("Enter Password:=");
		int password=sc.nextInt();
	
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
		sc.close();
	}
	
	
	//main method (Now we call both static method in to main method.)
	public static void main(String[] args) {
		Demo5.Run();
		System.out.println("***********************************");
		Demo5.Authentication();
		
	}

}
