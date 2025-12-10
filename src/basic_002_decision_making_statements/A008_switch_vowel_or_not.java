/**
 * 
 */
package basic_002_decision_making_statements;

import java.util.Scanner;

/**
 * @author lenovo
 * write a java program to print vowel or not using switch case
 *
 */
public class A008_switch_vowel_or_not {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----static input----");
		char ch = 'E'; 
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is not a vowel");
        }
        
        System.out.println("----dynamic input----");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch1 = sc.next().charAt(0);
        sc.close();
        switch (ch1) {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
            System.out.println(ch1 + " is a vowel");
            break;
        default:
            System.out.println(ch1 + " is not a vowel");
    }

	}

}
