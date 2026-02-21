/**
 * 
 */
package basic_010_exceptions_and_collections;

import java.util.Stack;

/**
 * @author lenovo
 *
 */
public class A013_Collections_Stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.add('A');
		s.add('B');
		s.add('C');
		s.add(null);
		s.add("java");
		s.add(0.151);
		s.add(2.13f);
		s.add("python");
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.search("python"));
		
		
		
		

	}

}
