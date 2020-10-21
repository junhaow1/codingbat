class Solution {
    public boolean isPowerOfThree(int n) {

//         long r = 1;
//         for (long i = 0; i<n;i++){
//             if (r ==n) return true;
//             r = r *3;

//         }

//         return false;

        return (Math.log10(n)/Math.log10(3)) % 1 == 0 ;

    }
}


// comment掉的是forloop 除了forloop的办法是用数学思想 具体手写思路我放github pr comment里
//https://leetcode.com/problems/power-of-three/
// 326. Power of Three
