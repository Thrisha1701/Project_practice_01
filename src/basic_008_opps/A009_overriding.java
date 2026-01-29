/**
 * 
 */
package basic_008_opps;

/**
 * @author lenovo
 *
 */
class parent_02 {
	public void m1(String message) {
		System.out.println("parent class method m1");
		System.out.println("parent " +message);
	}
	public void m2(int i) {
		System.out.println("parent class method m1");
		System.out.println("parent integer "+i);
	}
}

class child_02 extends parent_02 {
	public void m1(String message) {
		System.out.println("child class method m1");
		System.out.println("Child "+message);
	}
	public void m2(int i) {
		System.out.println("Child class method m1");
	}
}
public class A009_overriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent_02 p2 = new parent_02();
		p2.m1("Hello from parent class");
		p2.m2(55);
		child_02 c2 = new child_02();
		c2.m1("Hello from child class");
		

	}

}
