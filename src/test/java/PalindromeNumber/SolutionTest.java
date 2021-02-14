package PalindromeNumber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void firstTest(){
        Solution solution = new Solution();
        boolean answer = solution.isPalindrome(121);
        Assert.assertEquals(true, answer);
    }
    @Test
    public void secondTest(){
        Solution solution = new Solution();
        boolean answer = solution.isPalindrome(-121);
        Assert.assertEquals(false, answer);
    }
    @Test
    public void thirdTest(){
        Solution solution = new Solution();
        boolean answer = solution.isPalindrome(10);
        Assert.assertEquals(false, answer);
    }
    @Test
    public void fourthTest(){
        Solution solution = new Solution();
        boolean answer = solution.isPalindrome(-101);
        Assert.assertEquals(false, answer);
    }
}