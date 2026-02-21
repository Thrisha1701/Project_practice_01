/**
 * 
 */
package basic_010_exceptions_and_collections;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author lenovo
 *
 */
//@SuppressWarnings("rawtypes")
public class A019_Collections_Treemap_Comparator implements Comparator {
	
	//@Override
	public int compare(Object obj1,Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}

	/**
	 * @param args
	 */
//	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm = new TreeMap(new A019_Collections_Treemap_Comparator());
		tm.put(101, "java");
		tm.put(102, "python");
		System.out.println(tm);

	}

}
