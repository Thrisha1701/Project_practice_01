/**
 * 
 */
package basic_003_looping_statements;

/**
 * @author lenovo
 * write a java program to print 1 to 10 sum of the numbers using both 
 * static and dynamic 
 * 
 */
public class A009_sum_of_naturalnumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;  
        for (int i = 1; i <= 10; i++) {
            sum = sum + i; 
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
        
        int sum1 = 0;
        int j = 1;
        while (j <= 10) {
            sum1 += j;
            j++;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum1);
	}
}
        
        
        
		//A010: 1 + 2^1 + 2^2 +2^3 + 2^4 +........ +2^n
/**
 *      Scanner sc = new Scanner(System.in);
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

 */
		//A011: 1 - 2^1 - 2^2 - 2^3 - 2^4 -........ -2^n
/**
 * Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1; 
        for (int i = 1; i <= n; i--) {
            sum += Math.pow(2, i);
        }
        System.out.println("Sum of series 1 - 2^1 - 2^2 - ... - 2^" - n - " = " + sum);
       
 */
		//A012: factorial
		//difference btw while and do while
		//A013: sum of digits
		//Sample ip = 786 o/p = 7+8+6=21 > try to debug with pen and paper
		//A014: reverse of a given number > i/p= 786, o/p =687 >try to debug with pen and paper
		//A015: to check given number is palindrome
		//A016: fibonacci series >i/p= 5 o/p = 0,1,1,2,3,5
		//A017: write a java program in "for each" 
		
		

	
