/**
 * 
 */
package basic_010_exceptions_and_collections;

import java.util.HashSet;

/**
 * @author lenovo
 *
 */
public class A014_Collections_hashset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet();
		h.add('a');
		h.add(null);
		h.add('b');
		System.out.println(h.remove(null));
		System.out.println(h);
		
		
		

	}

}
