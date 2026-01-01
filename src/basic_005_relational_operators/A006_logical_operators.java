/**
 * 
 */
package basic_005_relational_operators;

/**
 * @author lenovo
 *
 */
public class A006_logical_operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 22;
		System.out.println("logical and operator");
		System.out.println(a>b && a>c);
		System.out.println(a<b && a<c);
		System.out.println(a!=b && a!=c);
		System.out.println(" ");
		System.out.println("logical or operator");
		System.out.println(a>b || a>c);
		System.out.println(a<b || a<c);
		System.out.println(a!=b || a!=c);
		System.out.println(" ");
		System.out.println("logical not operator");
		System.out.println(" ");
		System.out.println(!(a>b));
		System.out.println(!(b>a));
		

	}

}
