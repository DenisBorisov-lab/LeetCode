package IsomorphicStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<String, String> map = new HashMap<>();
        for (int i =0 ; i < s.length(); i++){
            map.put(String.valueOf(s.charAt(i)), String.valueOf(t.charAt(i)));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            result.append(map.get(String.valueOf(s.charAt(i))));
        }
        if (new HashSet<>(Arrays.asList(s.split(""))).size() != new HashSet<>(Arrays.asList(t.split(""))).size()){
            return false;
        }
        return t.equals(result.toString());
    }
}
