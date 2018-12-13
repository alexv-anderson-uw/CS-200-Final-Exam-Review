import java.io.File;

/**
 * Demonstrates using a Scanner to parse a string
 * 
 * @author Alex
 */
public class PathExample {

	/**
	 * Entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("---------------\nBad file path\n");
		
		File badFile = new File("data.txt");
		
		printFileInformation(badFile);
		
		System.out.println("\n---------------\nGood file path\n");
		
		File goodFile = new File("files/data.txt");
		
		printFileInformation(goodFile);
	}
	
	public static void printFileInformation(File file) {
		
		if(file == null) {
			System.out.println("The file object was null");
			return;
		}
		
		System.out.println("Absolute vs. Relative:");
		System.out.println("The resource at\n" + file.getAbsolutePath() + "\n\tand\n" + file.getPath() + "\nare the same.");

		System.out.println("\nExistance:");
		if(file.exists()) {
			System.out.println("Resource at " + file.getPath() + " does exist");
		} else {
			System.out.println("Resource at " + file.getPath() + " does NOT exist");
		}
		
		System.out.println("\nFile:");
		if(file.isFile()) {
			System.out.println("Resource at " + file.getPath() + " is a file");
		} else {
			System.out.println("Resource at " + file.getPath() + " is NOT a file");
		}
		
		System.out.println("\nDirectory:");
		if(file.isDirectory()) {
			System.out.println("Resource at " + file.getPath() + " is a directory");
		} else {
			System.out.println("Resource at " + file.getPath() + " is NOT a directory");
		}
	}
}
