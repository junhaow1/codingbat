public class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() -1;
        char[] r = new char[s.length()];
        while(i<j){
            if  (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u'){
                    r[i] = s.charAt(j);
                    r[j] = s.charAt(i);
                }else{
                    r[j] = s.charAt(j);
                    j--;
                }
            }else {
                r[i] = s.charAt(i);
                i++;
            }
        }

        return r.toString();
    }


    public static void main(String[] args) {

        reverseVowels("hello");
    }
}









//sec solution is smarter, based on the info from question 顺序排列的array
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// 167. Two Sum II - Input array is sorted
