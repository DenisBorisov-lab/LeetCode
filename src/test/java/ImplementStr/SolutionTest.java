package ImplementStr;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void firstTest() {
        Solution solution = new Solution();
        String haystack = "hello";
        String needle = "ll";
        Assert.assertEquals(2, solution.strStr(haystack, needle));
    }

    @Test
    public void secondTest() {
        Solution solution = new Solution();
        String haystack = "a";
        String needle = "a";
        Assert.assertEquals(0, solution.strStr(haystack, needle));
    }

    @Test
    public void thirdTest() {
        Solution solution = new Solution();
        String haystack = "hello";
        String needle = "a";
        Assert.assertEquals(-1, solution.strStr(haystack, needle));
    }

}