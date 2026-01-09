import java.util.*;
class Solution {
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = 1 << 30;
        int arrayLength = nums.length;
        for (int i = 0; i < arrayLength; ++i) {
            int left = i + 1;
            int right = arrayLength - 1;
          
            // Use two-pointer technique to find the closest sum
            while (left < right) {
                
                int currentSum = nums[i] + nums[left] + nums[right];
              
                
                if (currentSum == target) {
                    return currentSum;
                }
              
                
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
              
               
                if (currentSum > target) {
                   
                    --right;
                } else {
                    
                    ++left;
                }
            }
        }
      
        return closestSum;
    }
    public static void main(String[] args) {
        int [] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}