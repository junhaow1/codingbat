class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;

        long l = 0;
        long r = num;
        while(l<=r){
            long mid = l+(r-l)/2;
            if (mid*mid == num){
                return true;

            } else if (mid*mid < num){
                l = mid+1;
            }else {
                r = mid-1;

            }
        }
        return false;

    }
}


// 注意 第二个条件 mid平方小于num 说明太小了 要往右边移动 容易出错 binary search来解决这种问题
//https://leetcode.com/problems/valid-perfect-square/
// 367. Valid Perfect Square
