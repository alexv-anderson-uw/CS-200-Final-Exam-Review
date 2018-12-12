import java.util.Scanner;

/**
 * Demonstrates using a Scanner to parse a string
 * 
 * @author Sandhya
 */
public class ScannerExample {
	
	/**
	 * Entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		System.out.println("Enter a valid name ");
		name = scanner.next();
		
		System.out.println("which is your favorite Pokemon? ");
		String character = scanner.nextLine();
		
		System.out.println(name+"\'s favourite pokemon is "+ character);
				
		scanner.close();
	}
}
