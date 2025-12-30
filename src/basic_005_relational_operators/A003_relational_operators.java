/**
 * 
 */
package basic_005_relational_operators;

/**
 * @author lenovo
 fisrst_num 20
 second_num 30
 check relational operators ( a>b, a<b, a>=b, a<=b, a==b, a!=b)
 *
 */
public class A003_relational_operators {
	int a = 20;
	int b = 30;
	
	public void checkRelations() {
		System.out.println("first number is: " + a);
		System.out.println("second number is: " + b);
		
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("relational operators");
		A003_relational_operators obj = new A003_relational_operators();
		obj.checkRelations();

	}

}



      
