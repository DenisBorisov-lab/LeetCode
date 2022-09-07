package JumpGame;

public class JumpGameSolution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int duty = 0;
        for (int i = nums.length - 1; i > -1; i--) {
            if (nums[i] == 0 && i == nums.length - 1) {
                duty--;
            } else if (duty == 0 && nums[i] == 0) {
                duty -= 2;
            } else if (nums[i] + duty < 0) {
                duty--;
            } else {
                duty = 0;
            }
        }
        return duty == 0;

    }
}
