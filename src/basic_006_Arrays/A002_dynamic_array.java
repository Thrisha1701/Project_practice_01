/**
 * 
 */
package basic_006_Arrays;

import java.util.Scanner;

/**
 * @author lenovo
 *
 */
public class A002_dynamic_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----Static Length of an Array----");
		System.out.println("enter the values into th array:");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0; i<3; i++) {
			arr[i] = sc.nextInt();
			
		}
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
		for(int i = 0; i<3; i++) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("----Dynamic Length of an Array----");
		
		System.out.println("Enter the Length of The Array");
		int n = sc.nextInt();
		System.out.println("enter the values into th array:");
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++) {
			System.out.println(a[i]);
		}
		

	}

}
