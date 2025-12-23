/*
Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers. */

class index{
     static boolean checkPal(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
   static String longestPalindrome(String s) {
        int n = s.length();
        int maxlen = 1 , start = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j < n; j++){
                if(checkPal(s,i,j)&&(j-i+1)>maxlen){
                    start = i;
                    maxlen = j-i+1;
                }
            }
        }
        return s.substring(start, start + maxlen);
    }
     public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalindrome(s));
    }
}
