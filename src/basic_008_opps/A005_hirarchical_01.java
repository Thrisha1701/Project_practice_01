/**
 * 
 */
package basic_008_opps;
class Grand_duck {
	void eat() {
		System.out.println("the grand Duck is eating");
	}
}
class Duck extends Grand_duck{
	void barking() {
		System.out.println("the duck is barking");
	}
}
class Baby_duck extends Duck{
	void weep() {
		System.out.println("the baby duck is weeping");
	}
}
/**
 * @author lenovo
 *
 */
public class A005_hirarchical_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baby_duck b = new Baby_duck();
		b.barking();
		b.eat();
		b.weep();
		
		Duck d = new Duck();
		d.barking();
		d.eat();
	
		

	}

}
