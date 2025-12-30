/**
 * 
 */
package basic_004_datatypes_variables;

/**
 * @author lenovo
 *write a java program to print all the data types with fixed parameters
 */
public class A001_datatypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		float f = 12.3444f;
		double d = 4.897889;
		int decimal = 100;
		int binary = 0b111; //binary form
		int octal = 0111; //octal form 
		int hexa = 0x11; //hexa form
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("Integer value: " + i);
		System.out.println("Float value: " + f);
		System.out.println("Double value: " + d);
		System.out.println("Integer (Decimal): " + decimal);
        System.out.println("Integer (Binary): " + binary);
        System.out.println("Integer (Octal): " + octal);
        System.out.println("Integer (Hexadecimal): " + hexa);
        System.out.println("Boolean value: " + b1);
        System.out.println("Boolean value: " + b2);

	}

}
