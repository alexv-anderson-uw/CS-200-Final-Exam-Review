import java.util.Scanner;

/**
 * Demonstrates using a Scanner to parse a string
 * 
 * @author Sandhya
 */
public class ScannerExample {
	
	private static String promptFavoriteGame(Scanner scnr) {
		String favGame = "";
		System.out.println("Which is your favorite video game ? \n1. Fortnite: Battle Royale\n2. League of Legends\n"
				+ "3. Overwatch");
		int favNum = 0;
		// if(scnr.hasNextInt()) {
		favNum = scnr.nextInt();
		// }
		switch (favNum) {
		case 1:
			favGame = "Fortnite: Battle Royale";
			break;
		case 2:
			favGame = "League of Legends";
			break;
		case 3:
			favGame = "Overwatch";
			break;
		default:
			break;
		}
		return favGame;
	}

	/**
	 * Entry point for the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		System.out.println("Enter your name ");
		name = scanner.next();

		scanner.nextLine();
		System.out.println("which is your favorite Pokemon? ");
		String pokemon = scanner.nextLine();

		System.out.println(name + "\'s favourite pokemon is " + pokemon + "\n");

		String videoGame;
		do {
			videoGame = promptFavoriteGame(scanner);
		} while (videoGame.isEmpty());
		
		System.out.println(name + "\'s favourite video game is the " + videoGame);

		scanner.close();
	}
}
