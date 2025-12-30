/* Wap to check number is palindrome
than follow all test cases

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */


class palindrome {
   static boolean palindrome(int x) {
         int num = x, ans = 0;

        // Check for negative numbers
        if (x < 0)
            return false;

        // Reverse the number
        while (num>0){
            ans = ans * 10 + (num % 10); // Append last digit
            num /= 10; // Remove last digit
        }

        // Compare reversed number with original
        return ans == x;
    }
        public static void main(String[] args) {
            
            int x = 121;
            System.out.println(palindrome(x)); // Output: true
    }  
}
