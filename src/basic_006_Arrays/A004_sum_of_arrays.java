/**
 * 
 */
package basic_006_Arrays;

import java.util.Scanner;

/**
 * @author lenovo
 * sum of array before = 0, ask length from the user, array elements
 * enter array size = 3
 * enter the array elements = 
 * 10
 * 20
 * 30
 * sum of array = 60
 * 
 *
 */
public class A004_sum_of_arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of The Array");
		int Size = sc.nextInt();
		System.out.println("enter the values into th array:");
		int a[] = new int[Size];
		for(int i=0; i<Size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The Array Elements are: ");
		for(int i = 0; i<Size; i++) {
			System.out.println(a[i]);
		}		
		
		int sum = 0;
		for(int i=0;i<Size;i++) {
			sum+= a[i];
		}
		System.out.println("Sum of array = " +sum);

	}

}



