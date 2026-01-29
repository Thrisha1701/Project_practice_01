/**
 * 
 */
package basic_009_constructor_this_super_recurssion;

class person {
	int age;
	double height;
	double weight;
	
	person() {
		// TODO Auto-generated constructor stub
		System.out.println("no args 0r no parameter constructor");
		age = 0;
		height = 0.0;
		weight = 0.0;
	}
	
	person(int age) {
		System.out.println("one args (or) one parameter constructor");
		this.age = age;
		height = 0.0;
		weight = 0.0;
	}
	
	person(int age, double height) {
		System.out.println("two args or two parameter constructor");
		this.age =age;
		this.height = height;
		weight = 0.0;
	}
	
	person(int age, double height, double weight) {
		System.out.println("three args or three parameter constructor"); 
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String toString() {
		return "age:"+age +"\theight:"+height +" \tweight:" +weight;
		
	}
}


/**
 * @author lenovo
 *
 */
public class A003_constructor_overloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person p1 = new person();
		System.out.println(p1);
		
		person p2 = new person(22);
		System.out.println(p2);
		
		person p3 =new person(22, 5.2);
		System.out.println(p3);
		
		person p4 = new person(22, 5.2, 49.5);
		System.out.println(p4);

	}

}
