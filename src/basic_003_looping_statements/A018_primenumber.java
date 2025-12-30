/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A018_primenumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int c = 0;
		if(n<=1) {
			System.out.println();
		}
		for(int i=0;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				c++;
			}
		}
		if(c==2) {
			System.out.println("the given number is prime number");
		}
		else {
			System.out.println("the given number is not prime");
		}

	}

}
