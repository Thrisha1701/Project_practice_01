/**
 * 
 */
package basic_001_sample;

import java.util.Scanner;

/**
 * Write a java program to implement all arithmetic operators
 */
public class A003_arithmetic_operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("----- arithmetic operation with static input-----");
		int a = 22;
        int b = 34;
        int res;

        // Addition
        res = a + b;
        System.out.println("Addition is: "+res); 
        // Subtraction
        res = a - b;
        System.out.println("Subtraction is: "+res); 
        // Multiplication
        res = a * b;
        System.out.println("Multiplication is: "+res);
        // Division
        res = a / b;
        System.out.println("Division is: "+res); 
        // Modulus (Remainder)
        res = a % 7;
        System.out.println("Remainder is: "+res); 
        
        System.out.println("----- arithmetic operation with Dynamic input-----");
        
        int m,n,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        m = sc.nextInt();
        System.out.println("Enter the second number:");
        n = sc.nextInt();
        x=m+n;
		System.out.println("Addition of " + m + " and " + n + " is:" + x);
		x=m-n;
		System.out.println("subtraction of " + m + " and " + n + " is:" +x);
		x=m*n;
		System.out.println("Multiplication of " + m + " and " + n + " is:" +x);
		x=m/n;
		System.out.println("Division of " + m + " and " + n + " is:" +x);
		x=m%n;
		System.out.println("The remainde of " + m + " and " + n + " is:" +x);

	}

}
