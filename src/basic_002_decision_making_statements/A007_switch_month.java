/**
 * 
 */
package basic_002_decision_making_statements;

import java.util.Scanner;
/**
 * @author lenovo
 * case 1:i/p=1
 * o/p = january
 * 
 * try using static and dynamic
 *
 */
public class A007_switch_month {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----static inputs----");
		int a = 8;
		switch (a) {
		case 1:System.out.println("the month is january");
		break;
		case 2:System.out.println("the month is february");
		break;
		case 3:System.out.println("the month is march");
		break;
		case 4:System.out.println("the month is april");
		break;
		case 5:System.out.println("the month is may");
		break;
		case 6:System.out.println("the month is june");
		break;
		case 7:System.out.println("the month is july");
		break;
		case 8:System.out.println("the month is august");
		break;
		case 9:System.out.println("the month is september");
		break;
		case 10:System.out.println("the month is october");
		break;
		case 11:System.out.println("the month is november");
		break;
		case 12:System.out.println("the month is december");
		break;
		default:System.out.println("Enter the correct number");
		}
		
		System.out.println("----dynamic inputs----");
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		num = sc.nextInt();
		sc.close();
		switch (num) {
		case 1:System.out.println("the month is january");
		break;
		case 2:System.out.println("the month is february");
		break;
		case 3:System.out.println("the month is march");
		break;
		case 4:System.out.println("the month is april");
		break;
		case 5:System.out.println("the month is may");
		break;
		case 6:System.out.println("the month is june");
		break;
		case 7:System.out.println("the month is july");
		break;
		case 8:System.out.println("the month is august");
		break;
		case 9:System.out.println("the month is september");
		break;
		case 10:System.out.println("the month is october");
		break;
		case 11:System.out.println("the month is november");
		break;
		case 12:System.out.println("the month is december");
		break;
		default:System.out.println("Enter the correct number");
		}

	}

}
