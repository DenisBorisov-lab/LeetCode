package SortColors;

public class SortColors {
    public void sortColors(int[] nums) {
        int def = 0;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++)
            if (nums[j] < nums[i]){
                def = nums[i];
                nums[i] = nums[j];
                nums[j] = def;
            }
        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] nums = {1, 0, 2, 0};
        sortColors.sortColors(nums);
    }
}
