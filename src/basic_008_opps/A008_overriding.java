/**
 * 
 */
package basic_008_opps;

/**
 * @author lenovo
 *
 */
class parent_01 {
	public void m1(String message) {
		System.out.println("parent class method m1");
		System.out.println("---parent " +message);
	}
}

class child_01 extends parent_01 {
	@Override
	public void m1(String message) {
		System.out.println("child class method m1");
		System.out.println("---Child "+message);
	}
}
public class A008_overriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent_01 p1 = new parent_01();
		p1.m1("Hello from parent class");
		child_01 c1 = new child_01();
		c1.m1("Hello from child class");
		
		parent_01 p2 = new child_01();
		p2.m1("+++++Hello from parent object to child object");
		
		parent_01 p3 = new child_01();
		p3.m1("+++new object");

	}

}
