/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A005_try_catch_finally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Statement 1");
		try {
			System.out.println("Statement 2 - try block");
			System.out.println(10/0);//exception
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Statement 3 - catch block");
			System.out.println(10/2);//5
			System.out.println(10/0);//without finally block we cannot get the output of the exception
		} finally {
			System.out.println("Statement 4 - finally block");
		}
		

	}

}
