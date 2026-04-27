class Solution {
    public int maxProfit(int[] prices) {
       /* int finalMax = 0;
      for(int i = 0; i < prices.length ; i++) {
        int currProfit = 0;
        for(int j = i+1; j < prices.length; j++){
            currProfit = prices[j]-prices[i];
            finalMax = Math.max(currProfit,finalMax);
          }
      }
      return finalMax;*/
      int min = Integer.MAX_VALUE;
      int maxProfit = 0;
      for(int i = 0 ;i<prices.length;i++){
        if(prices[i] < min){
            min = prices[i];
        }else{
            maxProfit = Math.max(maxProfit,prices[i]- min);
        }
      }
       return maxProfit;
      }
     
     
}