class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}


class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums.length/2;
        Map<Integer,Integer> mm = new HashMap<Integer,Integer>();
        int result = 0;

        for (int n:nums){
            if (!mm.containsKey(n)){
                mm.put(n,1);
            } else {
                //不能mm.get(n)++;
                mm.put(n,mm.get(n)+1);
            }


            if (mm.get(n)>maj){
                // result= n;
                return n;
            }
        }
        return 0;
        // return result;
    }
}





// 第一种 是数学取巧做法 思路是 出现了超过半数次数的 element ，sort后一定在中间
// 第二种做法 建一个 hashmap 把每个element 存进去 和频率
//https://leetcode.com/problems/majority-element/
// 169. Majority Element
