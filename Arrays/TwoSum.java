import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
     //Brute force Approach - O(n2)
     /*int output[] = new int[2];
     
      int n = nums.length; 
      for(int i = 0; i < n ; i++){
        for(int j = i+1 ; j < n ; j++){
            if(nums[i]+ nums[j] == target){
              output[0] = i;
              output[1] = j;
             return output;
            }
        }
      }
      return output;*/
      //Optimized Approach - O(n)
      HashMap<Integer,Integer>map = new HashMap<>();
      for(int i = 0; i < nums.length; i++){
        int complement = target - nums[i];
        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }
        map.put(nums[i],i);
      }
      return new int[]{-1,-1};
    }
}