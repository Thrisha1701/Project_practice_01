/**
 * 
 */
package basic_005_relational_operators;

/**
 * @author lenovo
 *
 */
public class A001_variable_argument_method {
	public static void m1(int...x) {
		System.out.println("no. of arguments = "+x.length);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		m1(10);
		m1(10,20);

	}

}
