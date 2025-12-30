/**
 * 
 */
package basic_004_datatypes_variables;

/**
 * @author lenovo
 *
 */
public class A010_local_global_variables {
	public void m1() {
		int local_variable = 20; //local variable 
		System.out.println("Local Variable: "+local_variable);
	}
	
	//global variables
	
	public static int global_variable = 100;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A010_local_global_variables obj = new A010_local_global_variables();
		obj.m1();
		
		int local_variable_01 = 333; //local variable
		System.out.println(local_variable_01);
		
		System.out.println(global_variable);

	}

}
