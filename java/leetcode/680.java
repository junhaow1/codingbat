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

    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }






    // 第二个solution 更有条理 每个部分各司其职 第一个是我的 第一个需要调试




