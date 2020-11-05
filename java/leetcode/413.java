class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        int[] dp = new int[n];
        for (int i = 2; i < n; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        int total = 0;
        for (int cnt : dp) {
            total += cnt;
        }
        return total;
    }
}


//因为递增子区间不一定以最后一个元素为结尾，可以是任意一个元素结尾，因此需要返回 dp 数组累加的结果
//https://leetcode.com/problems/arithmetic-slices/
//413. Arithmetic Slices
