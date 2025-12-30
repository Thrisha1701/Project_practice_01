/**
 * 
 */
package basic_004_datatypes_variables;

/**
 * @author lenovo 
 *
 */
public class A008_static_variable {
	public static int istance_count = 0;
	private String name;
	
	public A008_static_variable(String name) {
		this.name = name;
		istance_count++;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A008_static_variable obj1 = new A008_static_variable("obj1");
		A008_static_variable obj2 = new A008_static_variable("obj2");
		A008_static_variable obj3 = new A008_static_variable("obj3");
		System.out.println("Number of instances created: "+A008_static_variable.istance_count);
		

	}

}
