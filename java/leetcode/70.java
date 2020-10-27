class Solution {
    // public int fib(int n){
    //     int r = 0;
    //     if (n == 1){
    //         // r = 1;
    //         return 1;
    //     } else if (n ==2){
    //         // r = 2;
    //         return 2;
    //     } else {
    //         return(fib(n-1) + fib(n-2)) ;
    //     }
    //     // return r;
    // }
    // public int climbStairs(int n) {
    //     return fib(n-1)+ fib(n-2) ;
    // }
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int pre2 = 1, pre1 = 2;
        for (int i = 2; i < n; i++) {
            int cur = pre1 + pre2;
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
}


// 新开了一个章节 dynamic programming 这道题用了fibnacci 数列的思想
//https://leetcode.com/problems/climbing-stairs/
// 70. Climbing Stairs
