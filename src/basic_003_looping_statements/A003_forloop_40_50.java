/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A003_forloop_40_50 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print natural numbers from 40 to 50");
		for (int i = 40; i <= 50; i++) {
            System.out.println(i);
        }
		
		System.out.println("---Using while loop---");
        int j = 40; 
        while (j <= 50) {
            System.out.println(j);
            j++;  
        }

	}

}
