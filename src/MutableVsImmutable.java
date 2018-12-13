import java.util.Arrays;

/**
 * Demonstrates the difference between mutable and immutable data types
 * 
 * Try to not get tangled in parameter passing but go for the immutable behavior
 * of strings vs array behavior.
 * 
 * Main takeaways:
 *      What assignment means
 *      When we assign to return values from methods
 *      Side effects of mutability
 * 
 * @author Mark
 */
public class MutableVsImmutable {

    /**
     * Entry point for the program
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println("nums initial value:\n" + Arrays.toString(nums) + "\n");

        modifyGiven(nums); // Note: we don't assign here. Can we? Should we? Has nums changed?
        System.out.println("nums after modifyGiven:\n" + Arrays.toString(nums) + "\n");

        returnFibonacci(nums); // Note: we don't assign here. Can we? Should we? Has nums changed?
        System.out
            .println("nums after returnNewArray (no assignment):\n" + Arrays.toString(nums) + "\n");

        nums = returnFibonacci(nums); // Note: we do assign here. Why? Has nums changed?
        System.out.println(
            "nums after returnNewArray (with assignment):\n" + Arrays.toString(nums) + "\n");

        String myName = "Mark Batman Wiemer"; // Note: it's spelled with an 'm', not an 'n' (that's
                                              // an important distinction)

        sliceString(myName);
        System.out.println("myName after slicing (no assignment): " + myName);

        myName = sliceString(myName);
        System.out.println("myName after slicing (with assignment): " + myName);
    }

    // Note: the return type of this method: we don't need to return anything. Why?
    // Note: we DO NOT reassign "nums" itself, only "nums[0]", "nums[1]", etc.
    /**
     * Modifies the given array, incrementing each value by 1
     */
    public static void modifyGiven(int[] nums) {
        for (int i = 0; i < nums.length; i++) { // iterate through every index of nums
            nums[i] = nums[i] + 1; // increment each value. Note: we reassign nums[i], NOT nums
        }
    }

    // Note: the return type
    // Note: how we DO reassign "nums" itself
    // Is the parameter necessary in this case?
    // If so, why? If not, how would we write this method without any parameters?
    /**
     * Returns a new array containing the first six elements of the Fibonacci sequence
     */
    public static int[] returnFibonacci(int[] nums) {
        nums = new int[] {1, 1, 2, 3, 5, 8}; // Note: we reassign nums here. What does this mean?
        return nums;
    }

    // Does this method return a copy, or modify the given parameter? How can we tell?
    /**
     * Returns roughly the first half of the string
     */
    public static String sliceString(String str) {
        int halfLength = str.length() / 2;
        return str.substring(0, halfLength);
    }
}
