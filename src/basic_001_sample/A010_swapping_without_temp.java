/**
 * 
 */
package basic_001_sample;

import java.util.Scanner;
/**
 * Swapping of 2 numbers without using temporary variable
 */
public class A010_swapping_without_temp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- swapping without temp by giving static inputs");
		int a=5, b=6;
		System.out.println("Before Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//method 2
		int c=5, d=6;
		c=(d*c)/(d=c);
		System.out.println("Method 2");
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		System.out.println("----- swapping without temp by giving static inputs");
		
		int a1,b1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		a1 = sc.nextInt();
		b1 = sc.nextInt();
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		System.out.println("After Swapping : " +a1 +" " +b1);
		//method 2
		int c1,d1;
		System.out.println("Enter the two numbers:");
		c1 = sc.nextInt();
		d1 = sc.nextInt();
		c1=(d1*c1)/(d1=c1);
		System.out.println("Method 2");
		System.out.println("After Swapping : " +c1 +" " +d1);
	
	}

}
