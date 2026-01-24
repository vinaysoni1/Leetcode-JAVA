class first_last_position {
    static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return n;
        
    }
    public static void main(String [] args){
        int [] nums = {1,4,2,6,3};
        int target = 0;
        System.out.println(searchInsert(nums,target));
    }
}