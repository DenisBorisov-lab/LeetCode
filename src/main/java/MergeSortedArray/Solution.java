package MergeSortedArray;

import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        for (int i = 0; i < m; i++){
            result[i] = nums1[i];
        }
        int j = 0;
        for (int i = n; i < n + m; i++){
            result[i] = nums2[j];
            j++;
        }
        result = sort(result);
        System.out.println(result);

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums, 3, nums2, 3);
    }
    public static int[] sort(int[] result){
        int comp = 0;
        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result.length; j++){
                if (result[j] > result[i]){
                    comp = result[i];
                    result[i] = result[j];
                    result[j] = comp;
                }
            }
        }
        return result;
    }
}
