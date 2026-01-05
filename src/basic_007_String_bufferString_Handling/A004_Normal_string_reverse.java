/**
 * 
 */
package basic_007_String_bufferString_Handling;

import java.util.Scanner;

/**
 * @author lenovo
 *
 */
public class A004_Normal_string_reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**System.out.println("enter a string: ");
		Scanner sc = new Scanner(System.in);	
		String s1 = sc.next();
		System.out.println(s1);
		*/
		
		String s2 = "tiger";
		System.out.println(s2);
		
		System.out.println(s2.length());//length of string for tiger
		System.out.println(s2.length()-1);//tiger with last index  
		System.out.println(s2.charAt(4));//4 is the last index of the string"tiger" 
		
		System.out.print(s2.charAt(4));
		System.out.print(s2.charAt(3));
		System.out.print(s2.charAt(2));
		System.out.print(s2.charAt(1));
		System.out.println(s2.charAt(0));
		
		String s3 = "hello";
		String rev = "";
		for(int i=s3.length()-1;i>=0;i--) {
			rev += s3.charAt(i);
		}
		System.out.println(rev);
		

	}

}
