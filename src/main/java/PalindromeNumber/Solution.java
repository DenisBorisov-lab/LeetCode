package PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        String reversedNumber = reverse(number);
        if (number.equals(reversedNumber)){
            return true;
        }else{
            return false;
        }
    }
    public static String reverse(String s){
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i > -1; i--){
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
