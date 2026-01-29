/**
 * 
 */
package basic_009_constructor_this_super_recurssion;
class student {
	int x = 10;
}

/**
 * @author lenovo
 *
 */
public class A013_super_keyword {
	protected A013_super_keyword() {
		System.out.println("protected constructor called");
	}
	
	private int id;
	A013_super_keyword(int id) {
		super();
		this.id = id;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A013_super_keyword obj1 = new A013_super_keyword();
		A013_super_keyword obj = new A013_super_keyword(22);
		System.out.println(obj.id);

	}

}
