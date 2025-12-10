/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A011_sum_of_series_subtraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum -= Math.pow(2, i);  
        }

        System.out.println("Sum of series 1 - 2^1 - 2^2 - ... - 2^" + n + " = " + sum);

	}

}
