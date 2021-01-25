package MedianSrtedArray;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++){
            numbers.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++){
            numbers.add(nums2[i]);
        }
        Collections.sort(numbers);
        if (numbers.size() % 2 != 0){
            int index = (int) Math.ceil(numbers.size() / 2);
            return numbers.get(index);
        }else{
            int fIndex = numbers.size() / 2;
            int sIndex = fIndex - 1;
            double result = ((double) numbers.get(fIndex) + (double) numbers.get(sIndex)) / 2;
            return result;
        }
    }
}
