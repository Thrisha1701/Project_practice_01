/**
 * 
 */
package basic_009_constructor_this_super_recurssion;

/**
 * @author lenovo
   -Constructor is a special method having same class name, it is used to initialize variables
    this won't return any type
   -We should not call constructors explicitly 
   -When we create an object, it will execute automatically
   -We applicable modifieds are public, private, protected and default
 */
public class A001_constructor {
	int i;
	String name;
	
	A001_constructor() {
		// TODO Auto-generated constructor stub
		i = 101;
		name = "python";
//		System.out.println(i);
//		System.out.println(name);
	}
	
	void display() {
		System.out.println(i);
		System.out.println(name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A001_constructor obj = new A001_constructor();
//		obj.A001_constructor();
		obj.display();

	}

}
