
import java.util.HashSet;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        // Create a Hashset to store elemnts from the array
        HashSet<Integer> seenNumbers = new HashSet<>();

        // Iterate through each element in the array
        for (Integer num : nums) {
            // Check if the elemnt already exists in the hashset
            if (seenNumbers.contains(num)) {
                return true;
            }
            // Add the elemnt to the hashset
            seenNumbers.add(num);
        }
        // Since we are out of the loop, that means that no duplicates are found
        return false;
    }
}
