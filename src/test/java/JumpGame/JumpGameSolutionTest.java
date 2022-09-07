package JumpGame;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameSolutionTest {

    @Test
    public void canJump() {
        Assert.assertTrue(new JumpGameSolution().canJump(new int[]{1, 2, 3, 4, 5}));
    }
}