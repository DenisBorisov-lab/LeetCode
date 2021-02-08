package LPS;

public class Solution {
    public static String longestPalindrome(String s) {
        String max = "";
//        String add;
//        String reverse;

        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j < s.length() + 1; j++){
//                add = s.substring(i, j);
//                reverse = new StringBuilder(add).reverse().toString();
                if (s.substring(i, j).length() > max.length() && s.substring(i, j).equals(new StringBuilder(s.substring(i, j)).reverse().toString())){
                    max = s.substring(i, j);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome(""));
    }
}
