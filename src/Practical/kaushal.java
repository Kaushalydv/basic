package Practical;

/*public class kaushal {
	public static void main(String[] args) {
		int x, y;
		for (x = 1; x < 5; x++) {
			for (y = 1; y <= x; y++) {
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}
	}
}*/
	


	
/*public class kaushal {
	public static void main(String[] args) {
		int x, y, row=5;
		for(x=0; x<row; x++) {
			for(y=0; y<=x; y++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
}*/




/*public class kaushal {
	public static void main(String[] args) {
		int x, y, row=5;
		for(x=0; x<row; x++) {
			for(y=2*(row-x); y>0; y--) {
				System.out.print(" ");
			}
			for(y=0; y<=x; y++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	} 
}*/



/* public class kaushal {
	public static void main(String[] args) {
		int x, y, row=5;
		for(x=0; x<row; x++) {
			for(y=row-x; y>0; y--) {
				System.out.print(" ");			// To print space between two stars. 
			}
			for(y=0; y<=x;y++) {
				System.out.print("* ");			// To print *
			}
			System.out.println(" ");			// Cursor goes to the new line after printing each line.
		}
	}
}*/




/*
public class kaushal {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		String S1=Integer.toString(a);			// Integer to String.
		String S2=Integer.toString(b);
		System.out.println("String S1="+S1);
		System.out.println("String S2="+S2);
	}
}
*/


/*
public class kaushal {
	public static void main(String[] args) {
		String S1="5678";
		String S2="9681";
		int a=Integer.parseInt(S1);					// String to integer
		int b=Integer.parseInt(S2);
		System.out.println("Integer a= "+a);
		System.out.println("Integer b= "+b);
	}
	
}
*/


/*
public class kaushal {
	public static void main(String[] args) {
		char C1='5';
		char C2='9';
		int a= Integer.parseInt(String.valueOf(C1));		//char to integer
		int b= Integer.parseInt(String.valueOf(C2));
		System.out.println("Integer a= "+a);
		System.out.println("Integer b= "+b);
	}
}
*/



public class kaushal {
	public static void main(String[] args) {
		int a=0, b=1, c, i, count=10;				//Fibonacci Series
		System.out.println(a+ " " +b);
		for(i=2; i<count; i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
		
	}
}


















