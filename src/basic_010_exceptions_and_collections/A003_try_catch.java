/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A003_try_catch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Statement 1");
		try {
			System.out.println("Statement 2 - inside the try block");
			System.out.println("try "+1010);
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Statement 3 - inside the catch block");
			System.out.println("catch "+1010);
			System.out.println(10/2);
		}
		
		System.out.println("Statement 4");

	}

}
