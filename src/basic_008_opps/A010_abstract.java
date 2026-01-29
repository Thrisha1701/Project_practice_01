/**
 * 
 */
package basic_008_opps;

/**
 * @author lenovo
 *
 */
abstract class bike {
	abstract void m1();
	void m2() {
		System.out.println("I'm in general method");
	}
	public void m3() {
		System.out.println("i'm in public void method");
	}
}
public class A010_abstract extends bike{
	void m1() {
		System.out.println("abstract void method");
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("there ");
		A010_abstract obj = new A010_abstract();
		obj.m1();
		obj.m2();
		obj.m3();
		
			
	}

}
