/**
 * 
 */
package basic_006_Arrays;

/**
 * @author lenovo
 *
 */
public class A001_arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 10;
		int a2 = 20;
		int a3 = 30;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println("-----");
		
		int a[] = new int[3];
		System.out.println("size of array is: "+a.length);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		//System.out.println(a[3]); index out of bound exception
		
		System.out.println("-----");
		
		int b[] = {10,20,30,40,50};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		//System.out.println(b[4]); index out of bound
		
		System.out.println("-----");
		
		System.out.println(b.length);//5(total length of array)
		System.out.println(b.length-1);//4(total index of array)
		
		System.out.println(b[0]);//first index value
		
		System.out.println("--last index/value--");
		int last_index = b.length-1;
		
		System.out.println(last_index);//print the last index of array
		System.out.println(b[last_index]);//print the last index value of array
		
		int last_second_index = b.length-2;
		
		System.out.println("--last second index/value--");
		System.out.println(last_second_index);//print the last second index of array
		System.out.println(b[last_second_index]);//print the last second index value of array
		System.out.println("--starting second index/value--");
		System.out.println(b.length-4);//print the second index of array
		System.out.println(b[1]);//print the second index value of array
		
		System.out.println("--Middle value--");
		int mid_value = (b.length-1)/2;
		System.out.println();//print the middle index of array
		System.out.println(b[mid_value]);//print the middle index value of array
		
		

	}

}
