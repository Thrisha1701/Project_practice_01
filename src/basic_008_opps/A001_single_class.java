/**
 * 
 */
package basic_008_opps;

/**
 * @author lenovo
 
 Opps concept: 
 1. Class: It is a group of variables and methods. It is also a keyword. 
           Class is a logical entity
           Class is a blue print
           Syntax: class classname { 
                   datatype variable_name_1;
                   datatype variable_name_2;
                   datatype method_name_1();
                   datatype method_name_2();
                   }
                   
          Ex :     class student {
                      int id ;
                      string name;
                      read();
                      write();
                   }
                   
 2. Object: Object is a real time entity
            object is an instance of a class
            object is a physical entity
            Syntax: class_name obj_name = new class_name();
            Ex:     Student s1 = new Student();
                    Student student = new Student();
                    Employee employee = new Employee();
            IQ: how many objects can be created for a class
              => As many as objects we can create for a single class
            IQ: how to access class numbers
            => using the dot(.) operator 
                    
 3. Abstraction: Hiding the internal details and showing the functionalities/implementing
                 details
                 
                 Ex: withdraw()
                 
 4. Inheritance: acquring properties from parent class(Super class or base class) 
                 into child class(sub class or deriverd class) 
                 We can use extence keyword from inheritance 
                 
                 types of inheritance:
                 1. single inheritance: single parent having single child 
                 2. multilevel inheritance: single parent having more than one child
                 3. multiple inheritance: different/many parent class with different/many child
                 4. Hierarchical inheritance: child to parent 
                 
                 
 5. Polymorphism: many forms
                  It exhibits more forms
                  
                  Types:
                  1. Method overloading: method name is same but with different types 
                  syntax: class method_overloading {
                             public void m1(){
                               sop("no args");
                             }
                             public void m1(int i){
                               sop("int args");
                             }
                             public void m1(float f){
                               sop("float args");
                             }
                             public void m1(double d){
                               sop("double args");
                             }
                             psv main(string[] args){
                                class_name obj = new class_name();
                                obj.m1();
                                obj.m1(10);
                                obj.m1(34.5f);
                                obj.m1(12.444);
                             }
                           }
                           
                  2. Method overriding: if child class is not satisfied with parent class 
                                        implementation, then the child class can override 
                                        based on its requirements.
                                 Method name is same and argument types also same
                   Syntax: Class parent {
                             public void m1(){
                                sop();
                             }
                             public void m1() {
                           		sop();
                        	 }
                        	 
                   ex: class parent {
                   	      public void m1(){ 
                   	      	sop("parent method");
                   	      }
                   	    }
                   	    class child extance parent{
                   	       public void m1(){
                   	         sop("child method");
                   	       }
                   	    }
                   	    public class overriding {
                   	      psv main (string[] args) {
                   	         parent p1 = new parent();
                   	         p1.m1();
                   	         child c1 = new child();
                   	         cl.m1();
                   	         parent p2 = new child();
                   	         p2.m1();
                   	         child c2 = new parent();//it won't work 
                   	         c2.m1(); // it also doesn't work
                        
                        
 6. Encapsulation: binding and wrapping up of data and method into a single entity
                   Class is an example for abstract class 
                   **abstract is a keyword
                   Abstract Class: It is a class that contains both abstract method and 
                                   we cannot create objects for abstract class
                                   
                   syntax: abstract class bike {
                              abstract void run();
                              void display(){ 
                                 sop("i'm in general method");
                              }
                           }
                           //extends is a keyword
                           public class abstract_class extends bike  {
                              void run() {
                                 sop("running safely");
                              }
                              psv main(string[] args) {
                                 class_name obj = new class_name();
                                 obj.run();
                                 obj.display();
                              }

Interface: It is a pure 100% abstract class. It contains only abstract method. We have to 
              use implements keyword.
              we cannot create objects for interface
              
              Exmp: Inteface interfaces {
                       int x = 10;
                       void m1();
                       void m2();
                    }
                    public class interface_example implements interfaces {
                        public void m1() {
                          sop("i'm in m1");
                        }
                        public void m2() {
                          sop("i'm in m2");
                        }
                        psv main(string[] args) {
                           class_name obj = new class_name();
                           obj.m1();
                           obj.m2();
                           sop(obj.x);
                        }
 
 */
public class A001_single_class {
	float salary = 15000;
	int bonous = 3000;


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A001_single_class obj = new A001_single_class();
		System.out.println(obj.salary);
		System.out.println(obj.bonous);

	}

}
