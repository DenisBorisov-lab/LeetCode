package UniquePaths;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathsSolutionTest {

    @Test
    void givenExampleThenCorrect() {
        assertEquals(28, new UniquePathsSolution().uniquePaths(3, 7));
    }

}