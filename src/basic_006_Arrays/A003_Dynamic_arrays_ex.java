/**
 * 
 */
package basic_006_Arrays;

import java.util.Scanner;

/**
 * @author lenovo
 *
 */
public class A003_Dynamic_arrays_ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
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
		
		System.out.println("-----");
	
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]); 
		
		System.out.println("-----");
		
		System.out.println(a.length);//5(total length of array)
		System.out.println(a.length-1);//4(total index of array)
		
		System.out.println(a[0]);//first index value
		
		System.out.println("--last index/value--");
		int last_index = a.length-1;
		
		System.out.println(last_index);//print the last index of array
		System.out.println(a[last_index]);//print the last index value of array
		
		int last_second_index = a.length-2;
		
		System.out.println("--last second index/value--");
		System.out.println(last_second_index);//print the last second index of array
		System.out.println(a[last_second_index]);//print the last second index value of array
		System.out.println("--starting second index/value--");
		System.out.println(a.length-4);//print the second index of array
		System.out.println(a[1]);//print the second index value of array
		
		System.out.println("--Middle value--");
		int mid_value = (a.length-1)/2;
		System.out.println();//print the middle index of array
		System.out.println(a[mid_value]);//print the middle index value of array

	}

}
