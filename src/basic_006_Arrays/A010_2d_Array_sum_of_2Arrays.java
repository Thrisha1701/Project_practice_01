/**
 * 
 */
package basic_006_Arrays;

/**
 * @author lenovo
 a[][] = 1,2,3,4
 b[][] = 5,6,7,8
 sum[][] = a[][]+b[][]
 sum[][] = 6,8,10,12
 
 6  8 
 10 12
 
 
 a = 1,2,3,4
 b = 1,2,3,4
 
 sum = 
 2  4
 6  8
 
 sum[i][j] = a[i][j] + b[i][j]
 *
 */
public class A010_2d_Array_sum_of_2Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Elements in array a are: ");
		int a[][] = {
				{1,2},
				{3,4}
		};
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
				System.out.println(a[i][j]+" ");
			}
		}
		System.out.println("Elements in Array b are: ");
		int b[][] = {
				{5,6},
				{7,8}
		};
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b.length; j++) {
				System.out.println(b[i][j]+" ");
			}
		}
		
		int[][] sum = new int[2][2];
		for(int i=0;i<2; i++) {
			for(int j=0; j<2; j++) {
				sum[i][j] = a[i][j]+b[i][j];
			}
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
