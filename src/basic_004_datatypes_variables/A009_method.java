/**
 * 
 */
package basic_004_datatypes_variables;

/**
 * @author lenovo
 *
 */
public class A009_method {
	static int x = 10;
	
	public static void m1() {
		System.out.println(x);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		m1();
		System.out.println(A009_method.x);
		A009_method.m1();
		A009_method obj = new A009_method();
		System.out.println(obj.x);
		obj.m1();
		
	}

}
