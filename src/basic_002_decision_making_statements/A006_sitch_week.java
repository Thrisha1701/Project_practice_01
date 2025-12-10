/**
 * 
 */
package basic_002_decision_making_statements;

import java.util.Scanner;

/**
 * @author lenovo
 * input = 1
 * output = the day is monday
 * case2 : i/p = 2
 *
 */
public class A006_sitch_week {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----static inputs----");
		int a = 8;
		switch (a) {
		case 1:System.out.println("the day is monday");
		break;
		case 2:System.out.println("the day is tuesday");
		break;
		case 3:System.out.println("the day is wednesday");
		break;
		case 4:System.out.println("the day isthursday");
		break;
		case 5:System.out.println("the day is friday");
		break;
		case 6:System.out.println("the day is saturday");
		break;
		case 7:System.out.println("the day is sunday");
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
		case 1:System.out.println("the day is monday");
		break;
		case 2:System.out.println("the day is tuesday");
		break;
		case 3:System.out.println("the day is wednesday");
		break;
		case 4:System.out.println("the day isthursday");
		break;
		case 5:System.out.println("the day is friday");
		break;
		case 6:System.out.println("the day is saturday");
		break;
		case 7:System.out.println("the day is sunday");
		break;
		default:System.out.println("Enter the correct number");
		}
	}

}
