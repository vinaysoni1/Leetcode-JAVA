// search in sorted rotated array
class Search_rotated{
    static int search(int []arr, int target){
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;

    }
    public static void main (String[] args){
        int [] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
}