class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0 ;
        int buying_price = Integer.MAX_VALUE;

        for(int i = 0; i< prices.length ;i++){
            buying_price = Math.min(buying_price,prices[i]);
            maxprofit = Math.max(maxprofit, prices[i]-buying_price);
        }
        return maxprofit;
    }
}
