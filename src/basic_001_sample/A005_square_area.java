/**
 * 
 */
package basic_001_sample;

import java.util.Scanner;
/**
 * write a program to find the area of a square
 */
public class A005_square_area {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- Area of square with Static input-----");
		int xyz = 44;
		//area of square = side*side
		int area = xyz * xyz;
		System.out.println("area of the square is: "+area);

		System.out.println("----- Area of square with Dynamic input-----");
		
		int side,ar;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square:");
		side = sc.nextInt();
		ar = side*side;
		System.out.println("Area of the square is: " +ar);
	}

}
