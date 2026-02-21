/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A004_try_catch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Statement 1");
		try {
			System.out.println("Statement 2 - inside try block");
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Statement 3 - inside catch block");
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println("Statement 4");
			e.printStackTrace();
		}

	}

}
