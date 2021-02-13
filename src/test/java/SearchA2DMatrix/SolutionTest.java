package SearchA2DMatrix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void firstTest(){
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Solution solution = new Solution();
        boolean answer = solution.searchMatrix(a, 3);
        Assert.assertEquals(true, answer);
    }
    @Test
    public void secondTest(){
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Solution solution = new Solution();
        boolean answer = solution.searchMatrix(a, 13);
        Assert.assertEquals(false, answer);
    }


}