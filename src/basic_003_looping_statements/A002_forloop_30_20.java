/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A002_forloop_30_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print natural numbers from 30 to 20");
		for (int i = 30; i >= 20; i--) {
            System.out.println(i);
		}
		
		System.out.println("---Using while loop---");
        int j = 30;  
        while (j >= 20) {
            System.out.println(j);
            j--;  
        }

	}

}
