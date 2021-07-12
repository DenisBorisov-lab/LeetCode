package SearchInsertPosition;

public class Search {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        if (nums[nums.length - 1] < target){
            result = nums.length;
        }
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == target){
                return i;
            }else if(nums[i] < target && nums[i + 1] >= target){
                return i + 1;
            }
        }
        return result;
    }
}
