/**
 * Demonstrates the rules for method signatures and overloading
 * 
 * @author TJ
 */
public class MethodSignatureAndOverloading {

	/**
	 * Entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 2;
		double y = 2.5;

		// Section 1, the basics
		// What methods get called here?
		System.out.println(basics(x));
		System.out.println(basics((int)y));
		System.out.println(basics(y));
		System.out.println(basics((double)x));

		// What about here?
		// System.out.println(basics(basics(y));

		// Section 2, fun with constructors
		// A bit more complicated
		// Namer test1 = buildNamer(x);
		// Namer test2 = buildNamer((double)x);

		// System.out.println(test1.getName());
		// System.out.println(test2.getName());

		// Section 3, confusion
		// System.out.println(confusion(x, y));
		// System.out.println(confusion(y, x));

		// What happens with this one?
		// System.out.println(confusion(x, x));


		// Section 4, extras
		// Read the comment on the first overload method
		// 	for more info
		// String loaded = overload(x, x, x);
		// System.out.println(loaded);
	}

	// Section 1, the basics
	public static int basics(double input) {
		return (int)input + 1;
	}

	public static double basics(int input) {
		return input;
	}

	// What if we add this one? Does the output change?
	// public static double basics(double input) {
	// 	return input;
	// }


	// Section 2, fun with constructors
	// Let's do multiple overloads
	// public static Namer buildNamer(int x) {
	// 	return new Namer();
	// }

	// public static Namer buildNamer(double x) {
	// 	return new Namer("Double: " + x);
	// }


	// Section 3, confusion
	// Can you guess which one is picked?
	// public static String confusion(int x, double y) {
	// 	return "Called confusion(int, double)";
	// }

	// public static String confusion(double x, int y) {
	// 	return "Called confusion(double, int)";
	// }

	// What if we include this one? Does the output change?
//	public static String confusion(int x, int y) {
//		return "Called confusion(int, int)";
//	}
	

	// Section 4, extras
	/** 
	 * The next part is a weird extra that you don't need to know but
	 * might find interesting
	 *
	 * In the following, some really weird stuff happens with what java considers 
	 *	to be ambiguous. If you try to call these methods with
	 *	overload(0, 0, 0); then some are ambiguous, but not all
	 *	of them. Let me know if you figure out the rule, it baffles me.
	 **/
	/** ----------- EXTRA START ----------- **/
//	public static String overload(double x, int y, double z) {
//		return "Got double, int, double";
//	}
//
//	public static String overload(double x, double y, int z) {
//		return "Got double, double, int";
//	}
//
//	public static String overload(int x, int y, double z) {
//		return "Got int, int, double!!";
//	}
//
//	public static String overload(int x, double y, double z) {
//		return "Got int, double, double!!";
//	}
//
//	public static boolean overload(double x, int y, int z) {
//		return false;
//	}
	/** This is the end of the extra stuff! **/
	/** ------------ EXTRA END ------------ **/
}

class Namer {
	private String name = "the default";
	
	public Namer() {
		makePlural(name);
	}

	Namer(String name) {
		setName(name);
	}

//	Namer() {
//		this("No-param!");
//	}
//
//	private	Namer(String name) {
//		this.name = name;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// Only allow non-null, non-empty names 
		if (name == null || name.length() < 1) {
			return;
		}

		this.name = name;
	}

	public void makePlural() {
		name = makePlural(name);
	}

	// What would happen if you remove the name param here?
	public static String makePlural(String name) {
		// What happens if I use this.name?
		return name + "s";
	}
}
