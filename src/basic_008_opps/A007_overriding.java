/**
 * 
 */
package basic_008_opps;

/**
 * @author www.thrisha.com
 *
 */
class parent {
	void m1() {
		System.out.println("parent class method m1");
	}
}

class child extends parent{
	void m1() {
		System.out.println("child class method m1");
	}
}
public class A007_overriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p = new parent();
		p.m1();
		child c = new child();
		c.m1();
		parent p1 = new child();
		p1.m1();
//		child c1 = new parent();
//		c1.m1();

	}

}
