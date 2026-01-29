/**
 * 
 */
package basic_008_opps;
/**
 * @author lenovo
 *
 */
public class A006_overloading {
	public void m1() {
		System.out.println("No Args");
	}
	public void m1(int i) {
		System.out.println("int Args");
	}
	public void m1(float f) {
		System.out.println("float args");
	}
	public void m1(double d) {
		System.out.println("Double Args");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A006_overloading obj = new A006_overloading();
		obj.m1();
		obj.m1(10);
		obj.m1(10.5f);
		obj.m1(10.5);

	}

}
