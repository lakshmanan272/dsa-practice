package leetcode.editor.en;

// Problem: LC 121 - Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class LC121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution solution = new LC121_BestTimeToBuyAndSellStock().new Solution();
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        int minsofar = prices[0];
        int ans=0;
        for(int i=0;i<prices.length;i++){
            int profit = prices[i]-minsofar;
            if(profit>ans){
                ans=profit;
            }
            minsofar = Math.min(prices[i],minsofar);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}