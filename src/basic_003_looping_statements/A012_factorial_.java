/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A012_factorial_ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n = 5;
	       int fact = 1;
	       for (int i = 1; i <= n; i++) {
	    	   fact *= i;
	        }
	        System.out.println("Factorial of " + n + " is " + fact);

	        System.out.println("---while loop---");
	        int fact1 = 1;
	        int j = 1;
	        while (j <= n) {
	            fact1 *= j;
	            j++;
	        }
	        System.out.println(fact1);

	}

}
