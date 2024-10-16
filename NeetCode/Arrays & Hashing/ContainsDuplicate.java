import java.util.*;

class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        /* 
        // Brute Force
        // Time Complexity: O(N^2)
        // Space Complexity: O(1)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
        */
        
        /* 
        // Sorting
        // Time Complexity: O(N log N)
        // Space Complexity: O(1) or O(n) depending on sorting algorithm
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
        */
        
        // Hash Set
        // Time Complexity: O(N)
        // Space Complexity: O(N)
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } 
            set.add(nums[i]);
        }
        return false;
    }
}