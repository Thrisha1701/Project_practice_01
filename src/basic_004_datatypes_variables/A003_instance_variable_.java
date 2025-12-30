/**
 * 
 */
package basic_004_datatypes_variables;

/**
 * @author lenovo
 *
 */
public class A003_instance_variable_ {
	int i;
	String s;
	short s1;
	float f;
	long l;
	double d;
	char c;
	boolean b;
	byte b1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A003_instance_variable_ obj = new A003_instance_variable_();
		obj.i = 10;
		System.out.println(obj.i);
		obj.s = "thrisha";
		System.out.println(obj.s);
		obj.s1 = 200;
		System.out.println("Short value: " + obj.s1);
		obj.f = 12.34f;
        System.out.println("Float value: " + obj.f);
        obj.l = 123456789L;
        System.out.println("Long value: " + obj.l);
        obj.d = 12345.6789;
        System.out.println("Double value: " + obj.d);
        obj.c = 'A';
        System.out.println("Char value: " + obj.c);
        obj.b = true;
        System.out.println("Boolean value: " + obj.b);
        obj.b1 = 10;
        System.out.println("Byte value: " + obj.b1);
	}

}
