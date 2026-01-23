class solution {
  static int removeDuplicates(int[] nums) {
     int n = nums.length;
     if(n<=1)
     return n;
     int newarr=1;
     for(int i=1; i<n; i++){
        if(nums[i]!=nums[i-1]){
            nums[newarr++]=nums[i];
        }
     } 
     return newarr;  
    }
    public static void main(String[] args){
        int [] nums =  {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(nums);

        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}