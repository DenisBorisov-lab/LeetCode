package ReverseInteger;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void firstTest(){
        Solution solution = new Solution();
        int answer = solution.reverse(120);
        Assert.assertEquals(21, answer);
    }
    @Test
    public void secondTest(){
        Solution solution = new Solution();
        int answer = solution.reverse(123);
        Assert.assertEquals(321, answer);
    }
    @Test
    public void thirdTest(){
        Solution solution = new Solution();
        int answer = solution.reverse(-123);
        Assert.assertEquals(-321, answer);
    }
    @Test
    public void fourthTest(){
        Solution solution = new Solution();
        int answer = solution.reverse(0);
        Assert.assertEquals(0, answer);
    }
    @Test
    public void fifthTest(){
        Solution solution = new Solution();
        int answer = solution.reverse(10);
        Assert.assertEquals(1, answer);
    }
}