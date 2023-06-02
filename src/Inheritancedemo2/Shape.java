package Inheritancedemo2;

public class Shape extends Addition {

		//static method
		static void Area(int l, int b) {
		int area=l*b;
		System.out.println("The area of rectangle = "+area);
		}
	
		static void Area(int side) {
		int area=side*side;
		System.out.println("The area of square = "+area);
		}
	
		static void Area(float r) {
		double areaa=3.14*r*r;
		System.out.println("The area of circle = "+areaa);
		}
}
