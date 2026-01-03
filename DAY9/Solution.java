import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    static String longest_commen_prefix(String [] s){
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length - 1];
        int minlength = Math.min(first.length(), last.length());
        	int i = 0;
        while (i < minlength && 
               first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0,i);
    }

    public static void main(String[] args) {
        String[] s = { "geeksforgeeks", "geeks",
                "geek", "geezer" };
        System.out.println(longest_commen_prefix(s));
    }
}