class Solution {
    public int maxCoins(int[] piles) {
        int max = 0;
        int num = piles.length -2;

        Arrays.sort(piles);
        for (int i = 0;i<piles.length / 3;i++){
            max+= piles[num];
            num=num-2;
        }


        return max;
    }
}


//medium question
//https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
//1561. Maximum Number of Coins You Can Get
