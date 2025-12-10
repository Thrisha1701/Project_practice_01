/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 * write a java program to print natural numbers from 1 to 10
 *starting value is 1 and ending is 10
 */
public class A006_forloop_oddnum_80_90 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print odd numbers from 80 to 90");
		for (int i = 81; i <= 90; i += 2) {
            System.out.println(i);
        }
		
		System.out.println("---Using while loop---");
        int j = 81;  
        while (j <= 90) {
            System.out.println(j);
            j += 2;  
        }
	}

}

