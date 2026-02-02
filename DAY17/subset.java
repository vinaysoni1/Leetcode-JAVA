import java.util.*;
class subset {

    static void printsubset(char arr[]){
        int n = arr.length;

        
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");

            
            String[] set;
            for (int j = 0; j < n; j++)

               
                if ((i & (1 << j)) > 0)
                    System.out.print(arr[j] + " ");

            System.out.println("}");
        }
    }
        public static void main(String[] args){
            char arr[] = {'a','b','c'};
            // int n = arr.length;
            printsubset(arr);
        }
}
