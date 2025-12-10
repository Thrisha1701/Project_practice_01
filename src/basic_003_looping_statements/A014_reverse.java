/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A014_reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int rev =0;
		while(n!=0) {
			int num = n%10;
			rev = rev*10+num;
			n = n/10;
		}
		System.out.println("reverse of the number is: " +rev);

	}

}
