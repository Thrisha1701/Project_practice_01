/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A002_try_and_catch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Statement 1");
		try {
			System.out.println("Statement 2 - inside try block");
			System.out.println(10/0);//java.lang.ArithmeticException(we wont get the error by using try block)
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Statement 3 - inside the catch block");
			//System.out.println(10/0);//getting error because we are not making the exception for this. 
			//exception handlers are not available inside the catch block
		}
		System.out.println("Statement 4 - outside the try-catch block");

	}

}
