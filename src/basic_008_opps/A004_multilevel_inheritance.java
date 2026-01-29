/**
 * 
 */
package basic_008_opps;
class Grand_dog {
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Grand_dog {
	void bark() {
		System.out.println("barking");
	}
}
class Baby_dog extends Dog {
	void weep() {
		System.out.println("the baby dog is weeping");
	}
}


/**
 * @author lenovo
 *
 */
public class A004_multilevel_inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baby_dog b = new Baby_dog();
		b.weep();
		b.bark();
		b.eat();
		

	}

}
