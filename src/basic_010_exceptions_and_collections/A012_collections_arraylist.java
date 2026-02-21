/**
 * 
 */
package basic_010_exceptions_and_collections;

import java.util.ArrayList;

/**
 * @author lenovo
 *
 */
public class A012_collections_arraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arraylist = new ArrayList();
		arraylist.add(10);
		arraylist.add("java");
		arraylist.add(null);
		arraylist.add(2, "python");
		System.out.println(arraylist);
		

	}

}
