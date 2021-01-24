package LongestSubstring;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder max = new StringBuilder();
        StringBuilder add;
        for (int i = 0; i < s.length(); i++){
            add = new StringBuilder(s.substring(i, i + 1));
            for (int j = i + 1; j < s.length(); j++){
                if (contains(add, s.substring(j, j+1))){
                    if (max.length() < add.length()){
                        max = add;
                        add = new StringBuilder();
                    }
                    break;
                }else{
                    add.append(s.charAt(j));
                }
            }
            if (add.length() > max.length()){
                max = add;
            }
        }
        return max.length();
    }

    public static boolean contains(StringBuilder sb, String s){
        if (sb.length() < s.length())
            return false;

        int foundLength = 0;

        for (int i = 0; i < sb.length(); i++)
        {
            if (sb.charAt(i) == s.charAt(foundLength))
                foundLength++;
            else
                foundLength = 0;

            if (foundLength == s.length())
                return true;
        }

        return false;
    }
}
