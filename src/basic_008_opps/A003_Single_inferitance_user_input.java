/**
 * 
 */
package basic_008_opps;

import java.util.Scanner;

class emp{
	float Salary ;
	void setSalary(float Salary) {
		this.Salary = Salary;
	}
}
/**
 * @author lenovo
 *
 */
public class A003_Single_inferitance_user_input extends emp{
	int bonus;
	void setBonus(int bonus) {
		this.bonus = bonus;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the employee salary: ");
		float f = sc.nextFloat();
		System.out.println("please enter the bonus of employee:");
		int b = sc.nextInt();
		A003_Single_inferitance_user_input obj = new A003_Single_inferitance_user_input();
		obj.setBonus(b);
		obj.setSalary(f);
		System.out.println("employee salary is: "+obj.Salary);
		System.out.println("employee bonus is: "+obj.bonus);

	}

}
