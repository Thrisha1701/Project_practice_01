/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A005_forloop_evennum_1_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("even numbers between 1 to 10");
		for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
		
		System.out.println("---Using while loop---");
        int j = 2;  
        while (j <= 10) {
            System.out.println(j);
            j += 2;  
        }

	}

}
