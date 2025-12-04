/**
 * 
 */
package basic_001_sample;

import java.util.Scanner;
/**
 * Write a program to find the square root of a number
 */
public class A006_squareroot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- squareroot of a given number using static input-----");
		double x = 30;
		System.out.println(Math.sqrt(x));

		System.out.println("----- Squareroot of a given number using Dynamic input-----");
		
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		System.out.println("Squareroot is: " +Math.sqrt(num));
	}

}
