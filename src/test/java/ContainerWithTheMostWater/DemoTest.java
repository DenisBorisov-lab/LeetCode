package ContainerWithTheMostWater;


import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    private final Demo demo = new Demo();

    @Test
    void GivenArrayThen49() {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, demo.maxArea(array));
    }

    @Test
    void GivenArrayThen1() {
        int[] array = {1, 1};
        assertEquals(1, demo.maxArea(array));
    }

    @Test
    @SneakyThrows
    void GivenArrayThenTrue() {
        String text = new String(Files.readAllBytes(Paths.get("./src/test/java/ContainerWithTheMostWater/data.txt")));
        int[] array = convert(text.split(","));
        assertEquals(705634720, demo.maxArea(array));
    }

    public int[] convert(String[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(array[i]);
        }
        return result;
    }

}