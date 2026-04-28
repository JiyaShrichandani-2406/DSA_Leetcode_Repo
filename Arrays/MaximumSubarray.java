class Solution {
    public int maxSubArray(int[] nums) {
       //brute force Approach:O(N2)
      /* int FinalSum =Integer.MIN_VALUE ;
       for(int i = 0; i < nums.length; i++) {
        int sum = 0;
        for(int j = i; j < nums.length ; j++){
            sum = sum + nums[j];
            if(sum > FinalSum){
                FinalSum = sum;
            }
           }
    }
        return FinalSum;*/
        // Optimized  Approach:O(n)
        int currSum = nums[0];
        int FinalSum = nums[0];
        for(int i = 1; i < nums.length ;i++){
            currSum = Math.max(nums[i],currSum + nums[i]);
            FinalSum = Math.max(currSum,FinalSum);
        }
        return FinalSum;
       }
}