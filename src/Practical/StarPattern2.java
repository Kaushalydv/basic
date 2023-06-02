package Practical;

public class StarPattern2 {

	public static void main(String[] args) {
		int x, y;
		int row = 5;
		for (x = 0; x<row; x++) {
			for (y=2*(row - x); y>= 0; y--) {
				System.out.print(" ");						// to print space
			}
			for (y=0; y<=x; y++) {
				System.out.print("* ");						// to print *
			}
			System.out.println(" ");						//Cursor goes to the new line after printing each line
		}

	}

}
