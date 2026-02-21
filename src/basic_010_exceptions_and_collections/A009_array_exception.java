/**
 * 
 */
package basic_010_exceptions_and_collections;

/**
 * @author lenovo
 *
 */
public class A009_array_exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4};
		System.out.println(array[3]);
		int[] arr1 = {5,6,7,8};
		System.out.print(arr1[0] +" ");
		System.out.print(arr1[1] +" ");
		System.out.print(arr1[2] +" ");
		System.out.println(arr1[3]);
		System.out.println(arr1[4]); //ArrayIndexOutOfBoundsException
	}

}
