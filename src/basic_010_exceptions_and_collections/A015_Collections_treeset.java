/**
 * 
 */
package basic_010_exceptions_and_collections;

import java.util.TreeSet;

/**
 * @author lenovo
 *
 */
public class A015_Collections_treeset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet();
		t.add('a');
		t.add('b');
		System.out.println(t);
		TreeSet<Integer> t1 = new TreeSet<>(new TreeSet());
		t1.add(10);
		t1.add(20);
		System.out.println(t1);
		//t1.add(null); - if it is a vector it should contain not null integer values
		TreeSet<String> t2 = new TreeSet<>(new TreeSet());
		t2.add("java");
		t2.add("python");
		//t2.add(null); - vectors won't accept null values
		System.out.println(t2);
		
		

	}

}
