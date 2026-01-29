/**
 * 
 */
package basic_007_String_bufferString_Handling;

import java.util.Locale;

/**
 * @author lenovo
 *
 */
public class A001_String1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		String Language_turkish = "i";
		String Language_tr = "merhaba";
		String s1 = "PYTHON";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));
		System.out.println(s.substring(0));
		System.out.println(s.substring(2));
		System.out.println(s.length());
		System.out.println(s.replace('a', 'p'));
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('v'));
		
		System.out.println(s.indexOf('y'));
		System.out.println(s.toUpperCase());
		System.out.println(Language_turkish.toLowerCase(Locale.forLanguageTag("tr")));
		System.out.println(Language_tr.toLowerCase(Locale.forLanguageTag("tr")));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals("PY"));
		System.out.println(s1.equals("PYTHON"));
		System.out.println(s1.equalsIgnoreCase("python"));
		
		String s2 = "    tiger    ";
		System.out.println(s2.trim());
		System.out.println(s2.concat(Language_tr));
		
		//System.out.println(s2.reverse());
		
		//s2.append(); //append works only for buffer strings
		
		System.out.println(s2.concat(s));
		int codepoint = s1.codePointAt(0);
		System.out.println(codepoint);
		
		String s3 = "PYTHON";
		
		System.out.println(s1.codePointBefore(1));
		System.out.println(s1.codePointCount(0, 2));
		System.out.println(s1.compareTo(s));
		//System.out.println(s1.compareToIgnoreCase(s2));
		//System.out.println(s1.contains(s1));
		//System.out.println(s1.contentEquals(s3));
		//System.out.println(s1.endsWith(s3));
		
	}

}
