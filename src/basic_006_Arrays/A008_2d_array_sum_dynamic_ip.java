/**
 * 
 */
package basic_006_Arrays;

import java.util.Scanner;

/**
 * @author lenovo
 int [][] arr = {
 {1,12,32},
 {74,45,6},
 {71,87,92}
 };
 
 sum of elements in the 2d array is = 420
 
 *
 */
public class A008_2d_array_sum_dynamic_ip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of Columns: ");
		int columns = sc.nextInt();
		
		int [][] array = new int[rows][columns];
		
		System.out.println("Enter the Array Ements: ");
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		int sum =0;
		System.out.println("Array Elements: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(array[i][j]+" ");
				sum += array[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Sum of the array elements is: " +sum);

	}

}
