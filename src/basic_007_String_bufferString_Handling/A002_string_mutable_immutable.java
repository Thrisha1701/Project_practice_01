/**
 * 
 */
package basic_007_String_bufferString_Handling;

/**
 * @author lenovo
 *
 */
public class A002_string_mutable_immutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---immutable---");

		String s1 = new String("java");

		System.out.println(s1);
		s1.concat("Software");
		System.out.println(s1);
		
		System.out.println("---mutable---");
		
		String s2 = new String("python");
		System.out.println(s2);
		String s3 = s2.concat(" Software");
		
		System.out.println(s3);
		
		System.out.println("---normal adding mutables---");
		String s4 = "Tiger";
		String s5 = " Lion";
		String s6 = s4.concat(s5);
		
		System.out.println(s6);
		

	}

}
