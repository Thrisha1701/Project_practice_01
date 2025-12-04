/**
 * 
 */
package basic_001_sample;

/**
 * Write a java program to implement all arithmetic operators
 */
public class A003_arithmetic_operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 22;
        int b = 34;
        int res;

        // Addition
        res = a + b;
        System.out.println("Addition is: "+res); 
        // Subtraction
        res = a - b;
        System.out.println("Subtraction is: "+res); 
        // Multiplication
        res = a * b;
        System.out.println("Multiplication is: "+res);
        // Division
        res = a / b;
        System.out.println("Division is: "+res); 
        // Modulus (Remainder)
        res = a % 7;
        System.out.println("Remainder is: "+res); 

	}

}
