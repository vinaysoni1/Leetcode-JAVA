class Solution {
   static int reverse(int x) {
        int rev =0;
        int rem;
        while(x!=0){
            rem = x % 10;
            rev = (rev * 10) + rem;
            x = x/10;
        }
       
        return rev;
    }
    public static void main(String[] args) {
       int x=123;
       System.out.println("Reverse :" + reverse(x));
    }
}
