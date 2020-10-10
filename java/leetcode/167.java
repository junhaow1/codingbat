class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i<numbers.length ;i++){
            for (int j = numbers.length-1;j>i;j--){
                if ((numbers[i] + numbers[j]) == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
        }
        return result;

    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int i = 0;
        int j = numbers.length-1;

        while (i<j){
            if((numbers[i]+numbers[j]) == target){
                result[0] = i+1;
                result[1] = j+1;
                break;
            }else if (numbers[i]+numbers[j] < target){
                i++;
            }else{
                j--;
            }
        }

        return result;

    }
}







//sec solution is smarter, based on the info from question 顺序排列的array
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// 167. Two Sum II - Input array is sorted
