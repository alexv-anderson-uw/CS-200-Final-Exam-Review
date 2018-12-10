
/**
 * Demonstrates exceptional control flow.
 * 
 * @author Nikhil
 */
public class ExceptionExample {

	public static void methodA(int num1) throws Exception {
		if (num1 <= 0) {
			System.out.print("ex ");
			throw new Exception();
		}
		System.out.print("A ");
	}

	public static void methodB(int num3) throws Exception {
		try {
			methodA(num3); 
		} catch (Exception ex) {
			methodA(-1*num3);
		}
	}

	public static void methodC(int num2) throws Exception {
		try {
			System.out.print("try2 ");
			methodB(num2);
		} catch (Exception ex1) {
			try {
				System.out.print("try1 ");
			} catch (Exception ex2) {
				methodA(num2);
			} finally {
				System.out.print("fin2 ");
				methodB(num2);
			}
		} finally {
			System.out.print("fin1 ");
		}
	}

	/**
	 * Entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			methodC(0); //
			System.out.print("main ");
		} catch (Exception ex) {
			System.out.print("ex2 ");
		}
		System.out.println();
	}
}









// ANSWER: try2 ex ex try1 fin2 ex ex fin1 ex2

