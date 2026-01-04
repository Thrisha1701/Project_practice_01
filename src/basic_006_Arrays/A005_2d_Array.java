/**
 * 
 */
package basic_006_Arrays;

import java.util.Scanner;

/**
 * @author lenovo
 Enter array elements 
 1
 2
 3
 4
 the array is : 
 1 2
 3 4
 
 i refers to rows and j refers to columns
 0,0 = 1
 0,1 = 2
 1,0 = 3
 1,1 = 4
 *
 */
public class A005_2d_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = new int[2][2];
		System.out.println("Enter the Array Elements: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				array[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

	}

}
