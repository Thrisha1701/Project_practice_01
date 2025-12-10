/**
 * 
 */
package basic_002_decision_making_statements;

import java.util.Scanner;
/**
 * @author lenovo
 *write a java program to print the vowel or not by converting the 
 *input from upper case to lower 
 */
public class A009_vowel_or_not_using_converting_character {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----static input----");
		char ch = 'e'; 
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is not a vowel");
        }
		
		System.out.println("----Dynamic input----");
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch1 = sc.next().charAt(0);
        sc.close();
        switch (Character.toLowerCase(ch1)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch1 + " is a vowel");
                break;
            default:
                System.out.println(ch1 + " is not a vowel");
        }

	}

}
