import java.util.HashSet;
import java.util.Set;

 class solution{
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (seen.contains(c)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(c);
            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); // Output: 3
    }
}