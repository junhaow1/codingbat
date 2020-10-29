class Solution {
    public int rob(int[] nums) {

        int pre2 = 0, pre1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.max(pre2 + nums[i], pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;

    }
}


//  dynamic programming
//定义 dp 数组用来存储最大的抢劫量，其中 dp[i] 表示抢到第 i 个住户时的最大抢劫量。
//由于不能抢劫邻近住户，如果抢劫了第 i -1 个住户，那么就不能再抢劫第 i 个住户
//总结 解决此类dp问题 找出题目中可以从头开始 一种规律 定义element 写出公式 然后转化为代码
//https://leetcode.com/problems/house-robber/
// 198. House Robber
