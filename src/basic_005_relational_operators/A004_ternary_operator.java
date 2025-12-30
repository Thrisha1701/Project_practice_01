/**
 * 
 */
package basic_005_relational_operators;

/**
 * @author lenovo
 *
 */
public class A004_ternary_operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_num = 10;
		int second_num = 30;
		int max = (first_num > second_num) ? first_num : second_num;
		System.out.println("max of two numbers: " +max);
		
		
		int a = 12;
		int b= 13;
		int c = 14;
		
		int maximum = (a > b) 
				? (a > c ? a : c) 
						: (b > c ? b : c); 
		System.out.println("First number: " + a); 
		System.out.println("Second number: " + b); 
		System.out.println("Third number: " + c); 
		System.out.println("Maximum of three numbers is: " + maximum);

	}

}
