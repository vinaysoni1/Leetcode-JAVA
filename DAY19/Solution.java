import java.util.Stack;
// import java.util.*;

class Solution {
    static boolean parenthess(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                Stack<Character> st;
               // char top = stack.pop();
               char top1 = stack.peek();
                if ((c == ')' && top1 != '(') ||
                    (c == '}' && top1 != '{') ||
                    (c == ']' && top1 != '[')) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
         String s = "[()()]{}";
            System.out.println((parenthess(s) ? "true" : "false"));

    }
}