/**
 * 
 */
package basic_001_sample;

import java.util.Scanner;
/**
 * Write a program to find the power of the given number
 */
public class A007_finding_powers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- power of a given number using static input-----");
		double a = 5, b = 4;
		double c = Math.pow(a, b);
		System.out.println("c = " +c);
		
		System.out.println("----- power of a given number using dynamic input-----");

		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		num2 = sc.nextInt();
		System.out.println("power value of given two numbers is: " +Math.pow(num1,num2));
	}

}
