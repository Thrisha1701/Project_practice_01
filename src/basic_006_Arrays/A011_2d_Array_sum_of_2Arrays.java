/**
 * 
 */
package basic_006_Arrays;

/**
 * @author lenovo
 *
 */
public class A011_2d_Array_sum_of_2Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = {
				{1,2},
				{3,4}
		};
		
		int[][] array2 = {
				{5,6},
				{7,8}
		};
		
		
		int[][] sum = new int[2][2];
		int rows = array1.length;
		int columns = array1.length;
		
		for(int i=0;i<2; i++) {
			for(int j=0; j<2; j++) {
				sum[i][j] = array1[i][j]+array2[i][j];
			}
		}
		System.out.println("Array 1: ");
		for(int i=0; i<rows;i++) {
			for (int j=0; j<columns; j++) {
				System.out.println(array1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Array 2: ");
		for(int i=0; i<rows;i++) {
			for (int j=0; j<columns; j++) {
				System.out.println(array2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Sum of Two Arrays: ");
		for(int i=0; i<2;i++) {
			for (int j=0; j<2; j++) {
				System.out.println(sum[i][j]+" ");
			}
			System.out.println();
		}

	}

}
