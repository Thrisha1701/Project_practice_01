/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A013_sum_of_digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---while loop---");
		int num = 786;  
        int sum = 0;
		while (num > 0) {
			sum += num%10;        
		    num /= 10;
		}
		System.out.println("Sum of digits of " + num + " is:" + sum);
		
		System.out.println("\n---for loop---");
		int a = 786;
		int b = 0;
		for(int i=String.valueOf(a).length();i>0;i--) {
			b+= a%10;
			a/=10;
		}
		System.out.println("Sum of digits of "+a+ " is: "+b);
	}

}
//try to write in for each
