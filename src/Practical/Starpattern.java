package Practical;

public class Starpattern {

	public static void main(String[] args) {
		int row = 5;
		for (int x = 0; x < row; x++) {
			for (int y = 0; y <= x; y++) {
				System.out.print(" * "); // printing *
			}
			System.out.println(" "); // cursor goes to next line after printing each line
		}

	}

}
