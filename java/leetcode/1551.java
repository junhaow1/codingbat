class Solution {
    public int minOperations(int n) {
        int[] a= new int[n];
        for (int i = 0;i<n;i++){
            a[i] = 2*i +1;
        }

        int left = 0;
        int right = n-1;
        int count = 0;

        while (left<=right){
            while(a[left]!=a[right]){
                a[left]+=1;
                a[right]-=1;
                count ++;

            }
            // count ++;
            left++;
            right--;

        }
        return count;

    }
}



//medium question
//https://leetcode.com/problems/minimum-operations-to-make-array-equal/
//1551. Minimum Operations to Make Array Equal
