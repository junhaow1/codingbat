class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int count = 0;
        int j = s.length()-1;
        while(i<=j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else {
                if (s.charAt(i+1) == s.charAt(j)){
                    count++;
                    i++;
                } else if (s.charAt(i) == s.charAt(j-1)){
                    count ++;
                    j--;
                } else {
                    return false;
                }
            }
        }

        return (count<=1);
    }
}






