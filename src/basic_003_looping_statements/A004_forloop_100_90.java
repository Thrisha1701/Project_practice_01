/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A004_forloop_100_90 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print natural numbers from 100 to 90");
		for (int i = 100; i >= 90; i--) {
            System.out.println(i);
		}
		
		System.out.println("---Using while loop---");
        int j = 100;  
        while (j >= 90) {
            System.out.println(j);
            j--;  
        }

	}

}
