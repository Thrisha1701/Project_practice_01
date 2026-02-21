/**
 * 
 */
package basic_010_exceptions_and_collections;
class CustomException extends Exception {
	public CustomException(String m) {
		super(m);
	}
}

/**
 * @author lenovo
 *
 */
public class A022_custom_exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new CustomException("Manual Exception");
		} catch (CustomException e) {
			// TODO: handle exception
			System.out.println("CustomException " +e.getMessage());
		}

	}

}
