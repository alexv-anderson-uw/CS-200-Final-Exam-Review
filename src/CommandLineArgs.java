import java.lang.NumberFormatException;;

/**
 * Demonstrates how to use command line arguments. 
 *
 * Command line arguments enable the user to constantly change
 * parameters to their program without having to compile their
 * source code again. Compilation could take a LONG time for 
 * substantial software projects with many dependencies.		 
 * 
 * @author Nikhil
 */
public class CommandLineArgs {

	/**
	 * Converts both strings to variables of type double.
	 * Performs multiplication and returns product.
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 * @throws NumberFormatException if either num1 or num2 (or both)
	 * cannot be converted into a double
	 */
	public static double multiply(String num1, String num2) throws NumberFormatException {
		double floatingPoint1 = Double.parseDouble(num1);
		double floatingPoint2 = Double.parseDouble(num2);
		return floatingPoint1 * floatingPoint2;
	}

	/**
	 * Entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Print out all command line arguments.
		 */
		System.out.printf("There are %d command line arguments\n", args.length);
		for (int i = 0; i < args.length; ++i) {
			System.out.printf("args[%d] = %s\n", i, args[i]);
		}

		/**
		 * A common way to check for valid input with command
		 * line arguments is to first check if there are a proper
		 * number of arguments.
		 * 
		 * We want the user to enter 2 floating point numbers.
		 * Our goal is to call the multiply() method so that we can
		 * multiply the 2 numbers that the user types in, and then
		 * print out the product.
		 * 
		 * Note that we place a try-catch block around the multiply()
		 * method, as the conversion from String to double is prone
		 * to fail.
		 */
		/*
		if (args.length != 2) {
			System.out.printf("Usage args: <floating_point1> <floating_point2>\n");
		} else {
			try {
				double product = multiply(args[0], args[1]);
				System.out.printf("%s * %s = %.2f\n", args[0], args[1], product);
			} catch (NumberFormatException ex) {
				System.out.printf("%s and %s could not be converted into floating point numbers\n", args[0], args[1]);
			}
		}
		//*/
	}
}
