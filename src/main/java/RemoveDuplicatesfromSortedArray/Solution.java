package RemoveDuplicatesfromSortedArray;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,1,2};
        System.out.println(solution.removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        int cnt = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] != nums[i+1]){
                cnt++;
            }
        }
        return cnt;
    }
}
