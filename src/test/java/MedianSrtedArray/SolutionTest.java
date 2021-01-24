package MedianSrtedArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void firstTest(){
        Solution go = new Solution();
        int[] value = {1, 3};
        int[] value2 = {2};
        double answer = go.findMedianSortedArrays(value, value2);
        Assert.assertEquals(2.0, answer, 0.0);
    }
    @Test
    public void secondTest(){
        Solution go = new Solution();
        int[] value = {1, 2};
        int[] value1 = {3, 4};
        double answer = go.findMedianSortedArrays(value, value1);
        Assert.assertEquals(2.5, answer, 0.0);
    }
    @Test
    public void thirdTest(){
        Solution go = new Solution();
        int[] value = {0, 0};
        int[] value1 = {0, 0};
        double answer = go.findMedianSortedArrays(value, value1);
        Assert.assertEquals(0.0, answer, 0.0);
    }
    @Test
    public void fourthTest(){
        Solution go = new Solution();
        int[] value = {2};
        int[] value1 = {};
        double answer = go.findMedianSortedArrays(value, value1);
        Assert.assertEquals(2.0, answer, 0.0);
    }

}