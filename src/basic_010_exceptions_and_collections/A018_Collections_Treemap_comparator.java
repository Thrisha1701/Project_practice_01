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
public class A018_Collections_Treemap_comparator implements Comparator<Object> {
	public int m1(Object obj1, Object obj2) {
		String s1 ="java";
		String s2 ="Anaconda";
		return s1.compareTo(s2);
	}
	private int m2() {
		return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> t = new TreeMap<>(new A018_Collections_Treemap_comparator());
		t.put("banana", "fruit");
		System.out.println(t);
		
		

	}
	//@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}



