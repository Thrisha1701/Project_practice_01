/**
 * 
 */
package basic_010_exceptions_and_collections;

import java.util.TreeMap;

/**
 * @author lenovo
 *
 */
public class A017_collections_Treemap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap t = new TreeMap();
		t.put(10, "java");
		t.put(20, "python");
		System.out.println(t);
		t.remove(10);
		System.out.println(t);
		t.clear();
		System.out.println(t);
		

	}

}
