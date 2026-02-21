/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A020_multy_catch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 5/0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithematic Exception "+e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception "+e.getMessage());
		}

	}

}
