package day01;
import java.util.*;

// Problem: LC 121 - Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Topic: C1 - Arrays + Two Pointers
// Day: 1

public class P2_LC121_BestTimeToBuyAndSellStock {

    // Synced from the LeetCode plugin (leetcode/editor/en/LC121_BestTimeToBuyAndSellStock.java).
    // Edit that file and save: this copy updates itself.

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

    public static void main(String[] args) {
        Solution solution = new P2_LC121_BestTimeToBuyAndSellStock().new Solution();
    }
}
