/**
 * 
 */
package basic_008_opps;

/**
 * @author lenovo
 *
 */
interface java {
	int x = 10;
	void m1();
	void m2();
	
}
public class A011_interface implements java {
	public void m1() {
		System.out.println("i'm in method m1");
	}
	public void m2() {
		System.out.println("i'm in method m2");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A011_interface obj = new A011_interface();
		obj.m1();
		obj.m2();
		System.out.println(obj.x);

	}

}
