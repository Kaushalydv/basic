package Day1;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

	System.out.println("Enter your name:");
		String name1=sc.next();
		System.out.println("Name is:"+ name1);
		
	System.out.println("Enter your Confirm Name:");	
		String name2=sc.next();
		System.out.println("Name is:" +name2);
	
	System.out.println(name1.equals(name2));
	
		sc.close();
	}

}
 