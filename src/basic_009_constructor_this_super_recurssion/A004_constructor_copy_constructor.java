/**
 * 
 */
package basic_009_constructor_this_super_recurssion;

class person_01 {
	int age;
	String name;
	
	person_01(String name, int age) {
		// TODO Auto-generated constructor stub
		System.out.println("this is original constructor");
		this.name = name;
		this.age = age;
	}
	
	person_01(person_01 p) {
		// TODO Auto-generated constructor stub
		System.out.println("this is a copy of original constructor");
		name = p.name;
		age = p.age;
	}
	
	public String toString() {
		return "name:" +name +"\tage:" +age ;
		
	}
}
/**
 * @author lenovo
 *
 */
public class A004_constructor_copy_constructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person_01 p1 = new person_01("thrisha", 22);
		System.out.println(p1); //this is original 
		
		person_01 p2 = new person_01(p1);
		System.out.println(p2);

	}

}
