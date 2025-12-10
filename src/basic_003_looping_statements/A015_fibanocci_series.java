/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A015_fibanocci_series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		int n1=0;
		int n2=1;
		System.out.println("Fibonacci series uo to "+n+"terms is:");
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<n;i++) {
			int n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
	}

}
