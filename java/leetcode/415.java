class Solution {
    public String addStrings(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        return String.valueOf(n1+n2);


    }
}

    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (carry == 1 || i >= 0 || j >= 0) {
            int x = i < 0 ? 0 : num1.charAt(i--) - '0';
            int y = j < 0 ? 0 : num2.charAt(j--) - '0';
            str.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return str.reverse().toString();
    }


// 第一种 用了parseInt 相当于偷懒了 捷径
// 第二种做法 一位一位 数字 读 8+9 = 17 加进去 7 下一位 进位
//https://leetcode.com/problems/add-strings/
// 415. Add Strings
