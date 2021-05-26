package MedianFinder;

import jdk.internal.org.objectweb.asm.tree.FrameNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void firstTest(){
        Solution solution = new Solution();
        for (int i = 1; i < 4; i++){
            solution.addNum(i);
        }
        double answer = solution.findMedian();
        Assert.assertEquals(2, answer, 0);
    }

    @Test
    public void secondTest(){
        Solution solution = new Solution();
        solution.addNum(5);
        solution.addNum(3);
        solution.addNum(4);
        double answer = solution.findMedian();
        Assert.assertEquals(4, answer, 0);
    }

    @Test
    public void thirdTest(){
        Solution solution = new Solution();
        solution.addNum(2);
        solution.addNum(3);
        double answer = solution.findMedian();
        Assert.assertEquals(1, answer, 5);
    }

    @Test
    public void fourthTest(){
        Solution solution = new Solution();
        double answer = solution.findMedian();
        Assert.assertEquals(0, answer, 0);
    }

}