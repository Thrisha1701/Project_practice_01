/**
 * 
 */
package basic_009_constructor_this_super_recurssion;

class parent_03 {
	int i;
	float f;
	String s;
	double d;
	short s1;
	long l;
	byte bt;
	char ch;
	boolean b;
	
}

/**
 * @author lenovo
 *
 */
public class A006_constructor_default_constructor {
	int x;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A006_constructor_default_constructor obj = new A006_constructor_default_constructor();
		System.out.println(obj.x);//this will get the value from local class file(present class:A006_constructor_default_constructor)
		
		parent_03 p1 = new parent_03();
		System.out.println(p1.i);
		System.out.println(p1.f);
		System.out.println(p1.s);
		System.out.println(p1.d);
		System.out.println(p1.s1);
		System.out.println(p1.l);
		System.out.println(p1.bt);
		System.out.println(p1.ch);
		System.out.println(p1.b);

	}

}
