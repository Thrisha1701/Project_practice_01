/**
 * 
 */
package basic_006_Arrays;

import java.util.Scanner;

/**
 * @author lenovo
 *
 */
public class A006_2d_array_dynamic_inputs {

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
		System.out.println("Enter the Array Elements: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				array[i][j]= sc.nextInt();
			}
		}
		System.out.println("the array is: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
