package com.ibm.leetcode;

/**
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *要求时间复杂度为O(n)。
 *
 * 动态规划思想 时间复杂O(n)
 * dp[i] 表示前i个数中连续数组的最大值
 * 如果 dp[i-1] <= 0 那么 dp[i] = nums[i]
 *     dp[i-1] > 0 纳闷 dp[i] = dp[i-1] + nums[i]
 */
public class LeetCode2048 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(dp[i - 1] <= 0){
                dp[i] = nums[i];
            }else{
                dp[i] = dp[i - 1] + nums[i];
            }
        }
        int result = dp[0];
        for(int i  = 1; i < dp.length; i++){
            if(dp[i] > result){
                result = dp[i];
            }
        }
        System.out.println(result);
    }
}
