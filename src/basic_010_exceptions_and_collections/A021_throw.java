/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A021_throw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new ArithmeticException("Manual Exception");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException " +e.getMessage());
		}

	}

}
