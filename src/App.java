import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Contains Duplicate
         * 
         * Given an integer array nums, retun true if any value appears at least twice
         * in the array and return false if every elemnt is distinct.
         */
        System.out.println("Hello, World!");
        Solution solution = new Solution();
        int[] containsDuplicate = { 1, 2, 3, 4, 5, 4 };
        System.out.println("Does the given input" + Arrays.toString(containsDuplicate) + " contains duplicates:"
                + solution.containsDuplicate(containsDuplicate));

        int[] doesnotContainDuplicate = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Does the given input" + Arrays.toString(containsDuplicate) + " contains duplicates:"
                + solution.containsDuplicate(doesnotContainDuplicate));
    }
}
