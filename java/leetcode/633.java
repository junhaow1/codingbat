class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i<= c ;i++){
            for (int j = i; j <=c;j++){
                if ((i*i + j*j) == c){
                    return true;
                }
            }
        }

        return false;
    }
}

class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i<= (int) Math.sqrt(c) ;i++){
            for (int j = i; j <=(int) Math.sqrt(c);j++){
                if ((i*i + j*j) == c){
                    return true;
                }
            }
        }

        return false;
    }
}


    public boolean judgeSquareSum(int target) {
        if (target < 0) return false;
        int i = 0, j = (int) Math.sqrt(target);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == target) {
                return true;
            } else if (powSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }




//第二个小优化 第三个complexity小 space time
//https://leetcode.com/problems/sum-of-square-numbers/
//633. Sum of Square Numbers