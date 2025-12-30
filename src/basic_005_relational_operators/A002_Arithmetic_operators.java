/**
 * 
 */
package basic_005_relational_operators;

/**
 * @author lenovo
 first_num
 sec_num 
 
 *
 */
public class A002_Arithmetic_operators {
	int a = 12;
	int b = 6;
	public void addition() {
		System.out.println("first number is: "+a);
		System.out.println("second number is: "+b);
		int sum = a+b;
		System.out.println("addition of two numbers is: "+sum);		
	}
	
	public void subtraction() {
		System.out.println("first number is: "+a);
		System.out.println("second number is: "+b);
		int sub = a-b;
		System.out.println("subtraction of two numbers is: "+sub);		
	}
	
	public void multiplication() {
		System.out.println("first number is: "+a);
		System.out.println("second number is: "+b);
		int mul = a*b;
		System.out.println("multiplication of two numbers is: "+mul);		
	}
	
	public void division() {
		System.out.println("first number is: "+a);
		System.out.println("second number is: "+b);
		int div = a/b;
		System.out.println("division of two numbers is: "+div);		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A002_Arithmetic_operators obj = new A002_Arithmetic_operators();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();

	}

}
