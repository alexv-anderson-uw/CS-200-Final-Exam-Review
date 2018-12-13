import java.util.ArrayList;

/**
 * Demonstrates using various methods on the ArrayList class
 * 
 * @author TJ
 */
public class ArrayListExample {

	/**
	 * Entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		// Create ArrayList for maximum fun
		// ArrayList<char[]> funList = new ArrayList<char[]>(Integer.MAX_VALUE);
		ArrayList<char[]> funList = new ArrayList<char[]>(0);
		printMyList(funList);

    // Are you ready to get started?
		funList.add(new char[] { 'm', '8', 'T' });
		funList.add(0, new char[] { 'a', 'y', 'e' });

		// printMyList(funList);


		// Let's change our list
		funList.get(1)[2] = 't';
		char[] liveOn = funList.get(0);
		funList.set(0, new char[] { 'g', '\'', 'd', 'a', 'y' });

		// printMyList(funList);


		// Re-addity
		funList.add(1, funList.get(1));

		// printMyList(funList);


		// Pointers matter!
		funList.get(2)[1] = 'a';
		funList.add(0, new char[5]);
		
		// printMyList(funList);


		// Pointers still matter!!
		funList.remove(funList.size() - 1);
		char[] someWord = funList.get(1);
		someWord[0] = 'h';
		someWord[2] = 'z';
		excitify(someWord);

		// printMyList(funList);


		// Affirmative
		funList.add(1, liveOn);
		funList.set(0, liveOn);
		// Some nonsense
		funList.remove(funList.get(funList.indexOf(funList.get(3))));

		// printMyList(funList);
	}

	public static void excitify(char[] letters) {
		letters[letters.length - 1] = '!';
	}

	public static ArrayList<char[]> mutagen(ArrayList<char[]> original) {
		ArrayList<char[]> mutant = copy(original);

		mutant.add(new char[] { 5, 10 });

		return mutant;
	}

	// Return a shallow copy of the original ArrayList
	public static ArrayList<char[]> copy(ArrayList<char[]> original) {
		return new ArrayList<char[]>(original);
	}

	static void printMyList(ArrayList<char[]> words) {
		System.out.print("[");
		int count = 0;
		for (char[] word : words) {
			if (count++ > 0)
				System.out.print(", ");
			System.out.print(word);
		}
		System.out.println("]");
	}
}
