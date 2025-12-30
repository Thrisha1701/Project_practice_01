/**
 * 
 */
package basic_004_datatypes_variables;

/**
 * @author lenovo
 *
 */
public class A004_instance_variable_method {
	int i =233;
	public void m1() {
		System.out.println(i);
		A004_instance_variable_method obj1 = new A004_instance_variable_method();
		System.out.println(obj1.i);
	}
	
	public void m2() {
		int x = 29;
		String s = "thrisha";
		System.out.println(s);
		System.out.println(x);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A004_instance_variable_method obj = new A004_instance_variable_method();
		System.out.println(obj.i);
		obj.m1();
		obj.m2();

	}

}
