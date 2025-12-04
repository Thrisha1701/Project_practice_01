/**
 * 
 */
package basic_001_sample;

import java.util.Scanner;
/**
 *Write a program to find the area of the rectangle 
 */
public class A004_rectangle_area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- Area of rectangle with Static input-----");
		int len = 5;
		int wid = 7;
		int area = len * wid;
		System.out.println("Area of the rectangle is: "+area);
		
		System.out.println("----- Area of rectangle with Dynamic input-----");
		
		int len1,wid1,res1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		len1 = sc.nextInt();
		System.out.println("Enter the width of the rectangle:");
		wid1 = sc.nextInt();
		res1 = len1 * wid1;
		System.out.println("Area of the rectangle is: "+res1);
		
	}

}
