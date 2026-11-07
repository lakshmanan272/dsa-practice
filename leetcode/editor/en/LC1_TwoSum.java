package leetcode.editor.en;

// Problem: LC 1 - Two Sum
// Link: https://leetcode.com/problems/two-sum/

public class LC1_TwoSum {
    public static void main(String[] args) {
        Solution solution = new LC1_TwoSum().new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + ", " + result[1]);   // expected: 0, 1
    }

//leetcode submit region begin(Prohibit modification and deletion)
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
//leetcode submit region end(Prohibit modification and deletion)

}
