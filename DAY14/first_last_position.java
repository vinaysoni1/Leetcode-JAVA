//find first and last position of an element in sorted array

import java.lang.reflect.Array;
import java.util.ArrayList;

class first_last_position{
    static ArrayList<Integer> searchRange(int [] arr, int x){
        int n = arr.length;
        int first = -1, last = -1;
        for(int i=0; i<n; i++){
            if(x!=arr[i])
                continue;
            if(first==-1){
                first = i;
                last = i;
            }

        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);
        return result;
    }
    public static void main(String[] args){
         int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
        ArrayList <Integer> positions = searchRange(arr, x);
        System.out.println(positions);

    }
}