package day01;

import java.util.*;
// Problem: LC 1 - Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Topic: C1 - Arrays + Two Pointers
// Day: 1

public class P1_LC1_TwoSum {

    // Synced from the LeetCode plugin (src/LC1_TwoSum.java).
    // Edit that file and save: this copy updates itself.

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[0];
        }
    }

    public static void main(String[] args) {
        Solution solution = new P1_LC1_TwoSum().new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + ", " + result[1]);   // expected: 0, 1
    }
}
