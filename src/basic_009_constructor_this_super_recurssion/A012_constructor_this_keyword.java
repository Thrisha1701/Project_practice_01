/**
 * 
 */
package basic_009_constructor_this_super_recurssion;

/**
 * @author lenovo
 *
 */
public class A012_constructor_this_keyword {
	private int id;
	private String name;
	
	A012_constructor_this_keyword(int id) {
		// TODO Auto-generated constructor stub
		this(id,"unknown");
	}
	
	A012_constructor_this_keyword(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A012_constructor_this_keyword obj = new A012_constructor_this_keyword(12);
		System.out.println(obj.id);
		System.out.println(obj.name);
		
//		A012_constructor_this_keyword obj1 = new A012_constructor_this_keyword(13, "thrisha");
//		System.out.println(obj1.id);
//		System.out.println(obj1.name);
		

	}

}
