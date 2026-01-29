/**
 * 
 */
package basic_009_constructor_this_super_recurssion;

/**
 * @author lenovo
 *
 */
public class A002_constructores_overloading {
	String name;
	float salary;
	int bonus;
	
	A002_constructores_overloading() {
		// TODO Auto-generated constructor stub
		name = "Ramu";
		salary = 15000;
		
	}
	
	A002_constructores_overloading(int i) {
		bonus = i;
	}
	
	A002_constructores_overloading(String S, float f) {
		name= S;
		salary = f;
	}
	
	
	
	void display() {
		System.out.println(name);
		System.out.println(salary);
	}
	
	void display1() {
		System.out.println(bonus);
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A002_constructores_overloading obj = new A002_constructores_overloading();
		obj.display();
		
		A002_constructores_overloading obj2 = new A002_constructores_overloading(200);
		obj2.display1();
		
		A002_constructores_overloading obj1 = new A002_constructores_overloading("thrisha", 30000);
		obj1.display();
		
		
		
	}

}
