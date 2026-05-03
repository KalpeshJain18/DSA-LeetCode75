package leetcode75;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Step 1: Build frequency for s1 and first window
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        // Step 2: Slide window
        for (int i = s1.length(); i < s2.length(); i++) {

            if (matches(s1Count, windowCount)) {
                return true;
            }

            // add new character
            windowCount[s2.charAt(i) - 'a']++;

            // remove old character
            windowCount[s2.charAt(i - s1.length()) - 'a']--;
        }

        // check last window
        return matches(s1Count, windowCount);
    }

    // Helper method to compare frequency arrays
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        PermutationInString obj = new PermutationInString();
        boolean result = obj.checkInclusion(s1, s2);

        System.out.println("Result: " + result);
    }
}