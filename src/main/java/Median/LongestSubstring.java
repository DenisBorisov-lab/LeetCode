package Median;

import java.util.Arrays;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        String max = new String();
        String add = new String();
        for (int i = 0; i < s.length() - 1; i++){
            add += s.substring(i, i + 1);
            for (int j = i + 1; j < s.length(); j++){
                if (Arrays.asList(add.split("")).contains(s.substring(j, j+1))){
                    if (add.length() > max.length()){
                        max = add;
                        add = "";
                    }
                    break;
                }
            }
            if (add.length() > max.length()){
                max = add;
            }
        }
        return max.length();
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));

    }
}
