/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A006_throw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Statement 1");
		throw new ArithmeticException("/by zero");

		/**
		 * Exception in thread "main" java.lang.ArithmeticException: /by zero
	at basic_010_exceptions_and_collections.A006_throw.main(A006_throw.java:18)

		 */
		//throw new ArithmeticException(20); //The constructor ArithmeticException(int) is undefined
		

	}

}
