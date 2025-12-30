/**
 * 
 */
package basic_004_datatypes_variables;

/**
 * @author lenovo
 *
 */
public class A007_static_nonstatic {
	int non_static_variable = 10;
	static int static_variable = 20;
	

	/**
	 * @param args
	 * we can call the static variables using object and method... 
	 * but in case of non static variables we cannot call them by 
	 * using method and it is only possible with objects
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A007_static_nonstatic obj = new A007_static_nonstatic();
		System.out.println("non Static variable: " +obj.non_static_variable);
		System.out.println("Static variable: "+obj.static_variable);
		
		//System.out.println("Non Static Variable: "+A007_static_nonstatic."instant variable is not available to fetch the details);
		System.out.println("static Variable: " +A007_static_nonstatic.static_variable);
		
		A007_static_nonstatic.ChangeNonstaticVariable(obj);
		System.out.println("Non Static Variable After Modification: "+obj.non_static_variable);
		
		A007_static_nonstatic.ChangeStaticVariable();
		System.out.println("Static Variable after modification: "+A007_static_nonstatic.static_variable);
		

	}
	
	public static void ChangeNonstaticVariable(A007_static_nonstatic obj) {
		obj.non_static_variable = 50;
	
	}
	
	public static void ChangeStaticVariable() {
		static_variable = 100;
	}

}
