package TwoSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumTest {
    @Test
    public void firstTest(){
        TwoSum go = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = go.twoSum(nums, target);
        int[] answer = {0, 1};
        Assert.assertEquals(Arrays.toString(answer), Arrays.toString(result));
    }
    @Test
    public void secondTest(){
        TwoSum go = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = go.twoSum(nums, target);
        int[] answer = {1, 2};
        Assert.assertEquals(Arrays.toString(answer), Arrays.toString(result));
    }
    @Test
    public void thirdTest(){
        TwoSum go = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        int[] result = go.twoSum(nums, target);
        int[] answer = {0, 1};
        Assert.assertEquals(Arrays.toString(answer), Arrays.toString(result));
    }

}