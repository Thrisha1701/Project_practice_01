/**
 * 
 */
package basic_001_sample;

/**
 * Swapping of 2 numbers without using temporary variable
 */
public class A010_swapping_without_temp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=6;
		System.out.println("Before Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//method 2
		int c=5, d=6;
		c=(d*c)/(d=c);
		System.out.println("Method 2");
		System.out.println("c="+c);
		System.out.println("d="+d);
	}

}
