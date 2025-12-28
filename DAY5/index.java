
class index {
  static int reverse(int x) {       
      int temp = x;
      long rev = 0; 
         
        while(temp!=0)  
        {
            rev=10*rev+ temp%10;
            temp=temp/10;
        }
        if(rev==(int)rev)   
            return (int)rev;    
        else
            return 0;
    }
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }
}