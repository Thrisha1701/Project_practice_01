/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 *
 */
public class A010_sum_of_series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
        int sum = 1;
        //initially sum=1, 1,3,7,15,31
        for (int i = 1; i <= n; i++) { //i=1,1<=4
        								//i=2,2<=4
        								//i=3,3<=4
        								//i=4,4<=4
        								//i=5,5<=4 condition not satisfied
            sum += Math.pow(2, i);
            //1+=Math.pow(2,1) > 2------ sum=3
            //3+=math.pow(2,2) > 4------ sum=3+4=7
            //7+=Math.pow(2,3) >8------- sum=7+8=15
            //15+=Math.pow(2,4) > 16-----sum=15+16=31
        }
        System.out.println("Sum of series 1 + 2^1 + 2^2 + ... + 2^" + n + " = " + sum);


	}

}
