/**
 * 
 */
package basic_001_sample;

/**
 * Swapping numbers using temporary variable
 */
public class A009_swaping_temp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		System.out.println("Before Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//Swapping logic starts
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
