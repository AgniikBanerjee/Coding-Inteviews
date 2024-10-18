import java.util.*;

public class LongestSubstringWithoutDuplicateCharacters {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for (int right = left + 1; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(right));
                left++;
            }
            set.add(s.charAt(right));
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}
