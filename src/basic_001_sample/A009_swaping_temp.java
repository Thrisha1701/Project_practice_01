/**
 * 
 */
package basic_001_sample;

import java.util.Scanner;
/**
 * Swapping numbers using temporary variable
 */
public class A009_swaping_temp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- swapping using temp with Static input-----");
		
		int a=10, b=20;
		System.out.println("Before Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//Swapping logic starts
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("----- swapping without using temp with dynamic input-----");
		
		int num1,num2,temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping the result is: " +num1 +"and" +num2);

	}

}
