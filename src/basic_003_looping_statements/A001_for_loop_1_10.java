/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 * write a java program to print natural numbers from 1 to 10
 *starting value is 1 and ending is 10
 */
public class A001_for_loop_1_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print natural numbers from 1 to 10");
		for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
		System.out.println("---using while loop---");
	    int j=1;
	    while(j<=10) {
	    	System.out.println(j);
	    	j++;
	    }
	}
}
		// A002 : for loop 30 to 20(starting is 30 and ending is 20)
		// A003: for loop 40 to 50
		// A004: for loop 100 to 90
		// A005: for loop even numbers from 1 to 10
		//A006: for loop odd numbers from 80 to 90
		// A007: for loop even numbers from  260 to 230
		//A008: odd numbers from 165 to 145
	

