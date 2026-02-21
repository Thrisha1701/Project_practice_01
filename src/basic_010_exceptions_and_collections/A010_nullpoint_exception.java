/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A010_nullpoint_exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		//System.out.println(s.length());
		try {
			String s1 = null;
			System.out.println(s1.length());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
