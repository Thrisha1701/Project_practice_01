/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A008_forloop_oddnum_165_145 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print odd numbers from 165 to 145");
		for (int i = 165; i >= 145; i -= 2) {
            System.out.println(i);
        }

        System.out.println("---Using while loop---");
        int j = 165;  
        while (j >= 145) {
            System.out.println(j);
            j -= 2;  
        }

	}

}
