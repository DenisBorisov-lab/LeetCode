package ThreeSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void firstTest() {
        Solution object = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> answer = object.threeSum(nums);
        List<Integer> firstPoint = new ArrayList<>();
        firstPoint.add(-1);
        firstPoint.add(-1);
        firstPoint.add(2);
        List<Integer> secondPoint = new ArrayList<>();
        secondPoint.add(-1);
        secondPoint.add(0);
        secondPoint.add(1);
        List<List<Integer>> correctAnswer = new ArrayList<>();
        correctAnswer.add(firstPoint);
        correctAnswer.add(secondPoint);
        Assert.assertEquals(correctAnswer, answer);
    }

    @Test
    public void secondTest() {
        Solution object = new Solution();
        int[] nums = {};
        List<List<Integer>> answer = object.threeSum(nums);
        List<List<Integer>> correctAnswer = new ArrayList<>();
        Assert.assertEquals(correctAnswer, answer);
    }

    @Test
    public void thirdTest(){
        Solution object = new Solution();
        int[] nums = {1, 2};
        List<List<Integer>> answer = object.threeSum(nums);
        List<List<Integer>> correctAnswer = new ArrayList<>();
        Assert.assertEquals(correctAnswer, answer);
    }

}