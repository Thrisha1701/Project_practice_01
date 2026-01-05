/**
 * 
 */
package basic_007_String_bufferString_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

/**
 * @author lenovo
 *
 */
public class A007_BufferReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s1 = "PYHTON";
		System.out.println(s1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s2 = sc.next();
		System.out.println(s2);
		
		System.out.println("---Buffer Reader---");
		
		InputStreamReader isr1 = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr1);
		System.out.println("Enter any String: ");
		String s3 = br1.readLine();
		System.out.println(s3);
		
		System.out.println("Enter any String: ");
		String s4 = br1.readLine();
		System.out.println(s4);

	}

}
