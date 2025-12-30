/**
 * 
 */
package basic_002_decision_making_statements;

import java.util.Scanner;
/**
 * @author lenovo
 *
 */
public class A002_max_of_2numbers {

	/**
	 * @param args
	 */
	public static void main(String[] thrisha) {
		// TODO Auto-generated method stub
		System.out.println("Logic 1");
		int num1 = 6;
		int num2 = 10;
		int max_num = Math.max(num1, num2);
		System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max_num);

		System.out.println("logic 2");

		if (num1 > num2) {
			System.out.println(num1 + "is largest");
		} else {
			System.out.println(num2 + "is largest");
		}

		System.out.println("logic 3");
		double first_num = 366.6666;
		double second_num = 25.5;
		double max = (first_num > second_num) ? first_num : second_num;
		System.out.println("the maximum number is: " +max);
		
		//try another logics and using scanner class
		System.out.println("using Dynamic Inputs");
		
		int a1,a2,max_value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		a1 = sc.nextInt();
		System.out.println("Enter the second value");
		a2 = sc.nextInt();
		sc.close();
		max_value = Math.max(a1, a2);
		System.out.println("Maximum of " + a1 + " and " + a2 + " is: " + max_value);

		System.out.println("logic 2");

		if (a1 > a2) {
			System.out.println(a1 + "is largest");
		} else {
			System.out.println(a2 + "is largest");
		}		
	}

}
