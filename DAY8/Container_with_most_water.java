 import java.util.*;
 
 class Container_with_most_water {

    static int maxarea(int [] height){
        int n =height.length;
        int res = 0;
         for(int i = 0; i<n; i++){
            for (int j=i+1; j<n; j++){
                int  amount  = Math.min(height[i], height[j]) * (j - i);
                res = Math.max(res, amount);
            }
         }
return res;
    }
    public static void main(String [] args ){
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxarea(height));

    }
}
