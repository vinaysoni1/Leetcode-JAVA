class DIVIDE_TWO_INTEGER{
    static long divide(long a, long b){
        if(a==Integer.MIN_VALUE && b==-1)
            return Integer.MAX_VALUE;
            int sign = ((a<0)^(b<0))?-1:1;
            a=Math.abs(a);
            b=Math.abs(b);
            long result =0;
            for(int i=31;i>=0;i--){
                if((a>>i)>=b){
                    result |= (1L<<i);
                    a -= (b<<i);
                }
            }
            
        
        return sign*result;

    }
    public static void main(String[] args){

        long a =43;
        long b =-8;
        System.out.println(divide(a,b));
    }

}