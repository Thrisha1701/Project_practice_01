/**
 * 
 */
package basic_008_opps;

/**
 * @author lenovo
 *
 */
public class A012_encapsulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("nikhil");
		System.out.println(s.getName());
		
		s.setNumber("two hunder twenty eight");
		System.out.println(s.getNumber());
		
		s.setAge(18);
		System.out.println(s.getAge());
		
		s.setPocket_money(277.8);
		System.out.println(s.getPocket_money());

	}

}
