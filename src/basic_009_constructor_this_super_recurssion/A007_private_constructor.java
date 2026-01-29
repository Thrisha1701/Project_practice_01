/**
 * 
 */
package basic_009_constructor_this_super_recurssion;

class parent_04 {
	static parent_04 name = null;
	public int age = 12;
	public String name_01 = "java";
	
	private parent_04() {
		
	}	
	
	static public parent_04 getInstance() {
		if(name == null) {
			name = new parent_04();
		}
		return name;
			
	}
}

/**
 * @author lenovo
 *
 */
public class A007_private_constructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent_04 p1 = parent_04.getInstance();
		parent_04 p2 = parent_04.getInstance();
//		p1.age = p1.age +10;
		System.out.println(p1.age);
		System.out.println(p2.name_01);

	}

}
