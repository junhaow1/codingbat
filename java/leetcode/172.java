public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
        }


class Solution {
    public int trailingZeroes(int n) {
        int r = 1;
        for (int i = n;i>0;i--){
            r = r *i;

        }


        if (r%10 ==0){
            int j = 0;
            while(r%10 == 0){
                j++;
                r = r/10;

            }

            return j;

        }else {
            return 0;
        }

    }
}


// 第一种 尾部的 0 由 2 * 5 得来，2 的数量明显多于 5 的数量，因此只要统计有多少个 5 即可。
//对于一个数 N，它所包含 5 的个数为：N/5 + N/52 + N/53 + ...，其中 N/5 表示不大于 N 的数中 5 的倍数贡献一个 5，N/52 表示不大于 N 的数中 52 的倍数再贡献一个 5
// 第二种做法 读10的倍数 笨办法172
//https://leetcode.com/problems/factorial-trailing-zeroes/
// 172. Factorial Trailing Zeroes
