/**
 * 
 */
package basic_007_String_bufferString_Handling;

import java.util.Scanner;

/**
 * @author lenovo
 *
 */
public class A003_StringBuffer_StringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter a string: ");
		Scanner sc = new Scanner(System.in);	
		String s1 = sc.next();
		System.out.println(s1);//prints normal string(input)
		//System.out.println(s1.reverse()); for normal strings reverse option won't work
		
		
		
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(s1);//prints the buffer string which is same as input
		
		System.out.println(sb.reverse());//prints the reverse string using buffer string
		
		StringBuilder sbl = new StringBuilder(s1);
		System.out.println(s1);//prints the string builder which is same as input 
		
		System.out.println(sbl.reverse());//prints the reverse string taking the i/p from stringbuilder
		
		System.out.println(sb.append("let"));
		

	}

}
