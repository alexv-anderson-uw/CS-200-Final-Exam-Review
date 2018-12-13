import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Demonstrates how to read to and write from a file
 * 
 * Takeaways:
 *      Lab 11, Exercise B, parts 3 & 4 are GOLD
 *      Use Scanners to read from files
 *      Use PrintWriters to write to files
 *      Always catch the possible FileNotFoundException: why is it thrown in each case?
 * 
 * @author Mark
 */
public class ReadWriteFiles {

    /**
     * Entry point for the program
     * @param args
     */
    public static void main(String[] args) {
        // Note: words.txt exists (it contains a bunch of words)
        String fileContents = readFileToString("words.txt");
        System.out.println("fileContents: <<" + fileContents + ">>");

        // Note: superBadMalwareGrossYucky.bad does not exist (if it does, delete it!)
        String malwareContents = readFileToString("superBadMalwareGrossYucky.bad");
        System.out.println("malwareContents: <<" + malwareContents + ">>");

        System.out.println("\nWriting to files...");
        writeToFiles();
    }

    /**
     * Reads the given file and returns a string containing its contents
     * @param filename
     */
    public static String readFileToString(String filename) {
        String str = "";
        File file = new File(filename);
        Scanner input = null;

        try {
            input = new Scanner(file); // This may throw a FileNotFoundException. Why?
            while (input.hasNextLine()) {
                str += input.nextLine();
                str += "\n"; // Remember scanners don't actually save newline characters
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oops, I can't find the given file: " + filename);
        } finally {
            if (input != null) {
                input.close();
            }
        }

        return str;
    }

    /**
     * Prompts the user to write to files of their choosing
     */
    public static void writeToFiles() {
        Scanner input = new Scanner(System.in);
        String filename = null;
        String userLine = null;
        PrintWriter writer = null;

        while (true) { // go until the user quits
            // Get user input (boring code here)
            System.out.print("Enter the name of the file to write to (empty string to quit): ");
            filename = input.nextLine();
            if (filename.equals("")) {
                break;
            }

            // Write to the file
            try {
                writer = new PrintWriter(filename); // This may throw a FileNotFoundException. Why?
                System.out.println("Okay, writing to " + filename
                    + ". Enter empty string to save and quit this file");
                
                while (true) {
                    System.out.print(">"); // visual prompt so the user knows their line was saved
                    userLine = input.nextLine();
                    if (userLine.equals("")) {
                        break;
                    }
                    writer.println(userLine); // write the line to the file
                }
            } catch (FileNotFoundException e) {
                System.out.println("Unable to write to " + filename);
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }
        }

        System.out.println("All done! Refresh Eclipse, your files were saved.");
    }
}
