/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A007_forloop_evennum_260_230 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("even numbers between 260 to 230");
		for (int i = 260; i >= 230; i -= 2) {
            System.out.println(i);
        }

        System.out.println("---Using while loop---");
        int j = 260;  
        while (j >= 230) {
            System.out.println(j);
            j -= 2;  
        }

	}

}
