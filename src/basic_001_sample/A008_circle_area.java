/**
 * 
 */
package basic_001_sample;

/**
 * Write a program to find the area of a circle
 */
public class A008_circle_area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 12;
		double result = Math.PI;
		System.out.println(result*radius*radius);
		
		double result_1 = Math.PI*Math.pow(radius,2);
		System.out.println(result_1);
           
	}

}
