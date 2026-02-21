/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A011_number_format_exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int x = 10;
		System.out.println(i+x);
		int i1 = Integer.parseInt("10");
		System.out.println(i1);
		int x1 = Integer.parseInt("ten");
		System.out.println(x1); //number format exception
		System.out.println(i1+x1);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
