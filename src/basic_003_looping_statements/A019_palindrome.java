/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A019_palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 434;
		int x, original_value;
		int rev = 0;
		original_value = n;
		while(n>0) {
			x = n%10;
			rev = (rev*10)+x;
			n=n/10;
		}
		if(original_value==rev) {
			System.out.println("the given number is a palindrome");
		} else {
			System.out.println("the given number is not palindrome");
		}

	}

}
/**
 divisor)dividend(quotient
        ----------
         remainder ---> x
  
 10 )434(43
     430
     ----
      4 --> remainder
 */
