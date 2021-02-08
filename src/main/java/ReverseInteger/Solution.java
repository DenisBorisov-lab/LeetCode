package ReverseInteger;

public class Solution {
    public int reverse(int x){
        String number = Integer.toString(x);
        StringBuilder result = new StringBuilder();
        for (int i = number.length(); i > 0; i--){
            result.append( number.substring(i - 1, i));
        }
        deletingZero(result);
        if (x < 0) {
            result.delete(result.length() - 1, result.length());
            result.insert(0, "-");
        }
        return  Integer.parseInt(result.toString());
    }

    public static void deletingZero(StringBuilder result){
        int j = 0;
        if (result.length() > 1){
            while(result.charAt(j) == '0'){
                result.delete(j, j + 1);
            }
        }
    }
}
