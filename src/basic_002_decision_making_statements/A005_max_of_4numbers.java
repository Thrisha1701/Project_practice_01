/**
 * 
 */
package basic_002_decision_making_statements;

import java.util.Scanner;

/**
 * @author lenovo
 * 
 *
 */
public class A005_max_of_4numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----static inputs----");
		int a =33;
		int b = 11;
		int c = 23;
		int d = 2;
		if(a>b) {
			System.out.println(a+ " is largest");
		}
		else if(b>c) {
			System.out.println(b+ " is largest");
		} 
		else if(c>d) {
			System.out.println(c+ " is largest");
		}
		else {
			System.out.println(d+ " is largest");
		}
		
		System.out.println("-----dynamic inputs-----");
		int num1,num2,num3,num4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		num1 = sc.nextInt();
		System.out.println("Enter the second value");
		num2 = sc.nextInt();
		System.out.println("Enter the third value");
		num3 = sc.nextInt();
		System.out.println("Enter the fourth value");
		num4 = sc.nextInt();
		if(num1>num2) {
			System.out.println(num1+ " is largest");
		} else if(num2>num3) {
			System.out.println(num2+ " is largest");
		}else if(num3>num4) {
			System.out.println(num3+ " is largest");
		}else {
			System.out.println(num4+ " is largest");
		}
		

	}

}
