/**
 * 
 */
package basic_009_constructor_this_super_recurssion;

/**
 * @author lenovo
 *
 */
public class A010_parameterized_constructor {
	private int id;
	private String name;
	
	A010_parameterized_constructor(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
//		display();
	}
	
	void display() {
		System.out.println(id);
		System.out.println(name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A010_parameterized_constructor A1 = new A010_parameterized_constructor(22, "java");
//		System.out.println(A1.id);
//		System.out.println(A1.name);
//		A1.display(); 
		
		

	}

}
