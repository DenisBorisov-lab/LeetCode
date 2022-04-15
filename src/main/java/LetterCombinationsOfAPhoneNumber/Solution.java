package LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        String[] numbers = "23456789".split("");
        String[] letters = "abc_def_ghi_jkl_mno_pqr_stu_vwyz".split("_");
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], letters[i]);
        }

        String[] digitsArray = digits.split("");


        return result;
    }

    public static void main(String[] args) {
        new Solution().letterCombinations("23");
    }
}
