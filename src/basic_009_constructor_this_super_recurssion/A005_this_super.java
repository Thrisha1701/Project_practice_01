/**
 * 
 */
package basic_009_constructor_this_super_recurssion;
class parent_02 {
	int x = 500;
}
class child extends parent_02 {
	int x = 200;
	public void m1() {
		System.out.println(this.x);//200
		System.out.println(super.x);//500
	}
}

/**
 * @author lenovo
 *
 */
public class A005_this_super {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1 = new child();
		c1.m1();

	}

}
