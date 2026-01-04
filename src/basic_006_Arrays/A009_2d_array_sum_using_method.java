/**
 * 
 */
package basic_006_Arrays;

/**
 * @author lenovo
 *
 */
public class A009_2d_array_sum_using_method {
	
	private static int calculateSum_m1(int[][] array) {
		int sum = 0;
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				sum += array[i][j];
			}
		}
		
		return sum;
	}
	

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
		
		int sum = calculateSum_m1(array);
		System.out.println("Sum of the Array Elements: "+sum);

	}

}
