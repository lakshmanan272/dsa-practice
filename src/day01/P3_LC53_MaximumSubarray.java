package day01;

// Problem: LC 53 - Maximum Subarray
// Link: https://leetcode.com/problems/maximum-subarray/
// Topic: C1 - Arrays + Two Pointers
// Day: 1

public class P3_LC53_MaximumSubarray {

    // Write your solution here
      class Solution  {
          public int maxSubArray(int[]nums){
              int maxsofar = nums[0];
              int currentsum= nums[0];
              for (int i=0;i<nums.length;i++){
                  if(currentsum<0){
                      currentsum=0;
                  }
                  currentsum += nums[i];
                  if(currentsum>maxsofar){
                      maxsofar = currentsum ;
                  }
              }
              return maxsofar;
          }


    }


    public static void main(String[] args) {

        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        P3_LC53_MaximumSubarray obj =
                new P3_LC53_MaximumSubarray();

        Solution sol = obj.new Solution();

        System.out.println(sol.maxSubArray(nums));
    }

}