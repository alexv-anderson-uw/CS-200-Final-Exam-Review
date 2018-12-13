import java.util.Arrays;

/**
 * Demonstrates the differences between reference and primitive data types
 * 
 * @author Alex
 */
public class ReferenceVsPrimitive {

	/**
	 * Entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 1;
		System.out.println("Before setInt i = " + i);
		setInt(i);
		System.out.println("After setInt i = " + i);
		
		System.out.println("\n");
		
		int[] mainArray = {1, 1, 1};
		System.out.println("Before setArray mainArray = " + Arrays.toString(mainArray));
		setArray(mainArray);
		System.out.println("After setArray mainArray = " + Arrays.toString(mainArray));
	}
	
	public static void setInt(int i) {
		System.out.println("\tIn setInt, i = " + i);
		i = 4;
		System.out.println("\tIn setInt, i = " + i);
	}
	
	public static void setArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("\tIn setArray, array = " + Arrays.toString(array));
			array[i] = 4;
		}
		System.out.println("\tIn setArray, array = " + Arrays.toString(array));
	}
}
