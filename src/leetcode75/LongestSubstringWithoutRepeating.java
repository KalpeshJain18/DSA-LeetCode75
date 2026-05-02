package leetcode75;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // shrink window if duplicate exists
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // add current character
            set.add(s.charAt(right));

            // update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String input = "abcabcbb";

        LongestSubstringWithoutRepeating obj = new LongestSubstringWithoutRepeating();
        int result = obj.lengthOfLongestSubstring(input);

        System.out.println("Longest Length: " + result);
    }
}