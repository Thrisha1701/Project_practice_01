/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *2,4,6,8,10
 */
public class A020_sum_of_even_numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("logic 1");
		int end_point = -4;
		int sum = 0;
		for(int i=1; i<=end_point; i++) {
			if(i%2 ==0) {
				sum += i;
			}
		}
		
		System.out.println("sum of even numbers from 1 to "+end_point+ " is: " + sum);
		
		System.out.println("logic 2");
		
		int n = -8;
		int x = (n/2)*(n/2+1);
		System.out.println("sum of even numbers upto "+n+ " is: "+x );
		
		System.out.println("logic 3");
		
		int num = 0;
		int sum1 = 0;
		for(int i=2; i<=num; i +=2) {
			sum1 += i;
		}
		//System.out.println("sum of even numbers upto "+num+ " is: "+sum1 );
		System.out.println(sum1 == 0 ? "NEGATIVE or ZERO values are not considered" : "sum is " +sum1);

	}
/**
 tickets = incidents i.e = INC109267 
 p4 = low priority
 p3 = medium priority
 p2 = urjent priority
 p1 = emergency priority
 
 problem ticket = combination of p1,p2,p3, and p4
 
 task = TASK109267 
 sc task = small task 
 vendor ticket = 3rd party 
 */
}
