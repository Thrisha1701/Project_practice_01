/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A008_throws {
	public static void m1() throws InterruptedException {
		System.out.println("Statement 4 - i'm in m1");
//		System.out.println(10/0); - getting exception for not using try catch block
		Thread.sleep(5000);
		System.out.println("Statement 5 - i'm in throws keyword");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Statement 1");
		try {
			System.out.println("statement 2 - inside try block");
			m1();
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("statement 3 - inside catch block");
			//e.printStackTrace();
		}

	}

}
