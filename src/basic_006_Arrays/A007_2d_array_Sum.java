/**
 * 
 */
package basic_006_Arrays;

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
public class A007_2d_array_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {
				 {1,12,32},
				 {74,45,6},
				 {71,87,92}
				 };
		
		int sum = 0;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				sum += array[i][j];
			}
		}
		
		System.out.println("Sum of the Array Elements: "+sum);

	}

}

