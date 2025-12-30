/**
 * 
 */
package basic_004_datatypes_variables;

/**
 * @author lenovo
 *
 */
public class A006_static_variable {
	static int x = 10;
	public static void m1() {
		System.out.println(x);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A006_static_variable obj = new A006_static_variable();
	    obj.m1();
	    System.out.println(x);
	    m1();
	    System.out.println(A006_static_variable.x);
	    A006_static_variable.m1();
	    

	}

}
