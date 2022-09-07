package ThreeSum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int size = nums.length;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> pointList = new ArrayList<>();
                        pointList.add(nums[i]);
                        pointList.add(nums[j]);
                        pointList.add(nums[k]);
                        set.add(pointList);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
