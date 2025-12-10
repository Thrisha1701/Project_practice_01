/**
 * 
 */
package basic_002_decision_making_statements;

/**
 * @author lenovo
 * case 1
 * input = 7
 * output = the number is single digit
 * case 2
 * input = 67
 * output = you entered a double digit num
 * case 3
 * input = 678
 * output = you entered a triple digit num
 *
 */
public class A003_single_double_triple_digit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * a=9
		 * if a>=0 && a<=9
		 * output is single digit
		 * else if a>=10 && a<=99
		 * output is double digit
		 * else if a>=100 && a<=999
		 * output is triple digit
		 * else number has more digits 
		 */
		int num = 88;
		if (num >= 0 && num <= 9) {
            System.out.println(num + " is single digit number");
        } else if (num >= 10 && num <= 99) {
            System.out.println(num + " is double digit number");
        } else if (num >= 100 && num <= 999) {
            System.out.println(num + " is triple digit number");
        } else {
            System.out.println(num + " is more than triple digit number");
        }


	}

}
