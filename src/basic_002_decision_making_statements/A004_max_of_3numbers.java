/**
 * 
 */
package basic_002_decision_making_statements;

import java.util.Scanner;
/**
 * @author lenovo
 * user will give 3 numbers, we need to find the max of 3 numbers
 *
 */
public class A004_max_of_3numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----static inputs----");
		int a =3;
		int b = 11;
		int c = 23;
		if(a>b) {
			System.out.println(a+ " is largest");
		}
		else if(b>c) {
			System.out.println(b+ " is largest");
		} else {
			System.out.println(c+ " is largest");
		}
		
		System.out.println("-----dynamic inputs-----");
		
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		num1 = sc.nextInt();
		System.out.println("Enter the second value");
		num2 = sc.nextInt();
		System.out.println("Enter the third value");
		num3 = sc.nextInt();
		if(num1>num2) {
			System.out.println(num1+ " is largest");
		} else if(num2>num3) {
			System.out.println(num2+ " is largest");
		}else {
			System.out.println(num3+ " is largest");
		}
		

	}

}
