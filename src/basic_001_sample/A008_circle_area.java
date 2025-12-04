/**
 * 
 */
package basic_001_sample;

import java.util.Scanner;
/**
 * Write a program to find the area of a circle
 */
public class A008_circle_area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- Area of circle with Static input-----");
		double radius = 12;
		double result = Math.PI;
		System.out.println(result*radius*radius);
		
		double result_1 = Math.PI*Math.pow(radius,2);
		System.out.println(result_1);
		
		System.out.println("----- Area of circle with dynamic input-----");
		
		int rad;
		double res,res1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle :");
		rad = sc.nextInt();
		res = Math.PI;
		res1 = res*Math.pow(rad, 2);
		System.out.println("Area of circle is: " +res1);

	}

}
