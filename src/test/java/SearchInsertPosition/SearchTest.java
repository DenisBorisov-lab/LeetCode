package SearchInsertPosition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {
    @Test
    void test(){
        final Search search = new Search();
        int[] nums = {1, 3, 5, 6};
        final int[] number = {1};
        assertAll(
                () -> assertEquals(search.searchInsert(nums, 5), 2),
                () -> assertEquals(search.searchInsert(nums, 2), 1),
                () -> assertEquals(search.searchInsert(nums, 7), 4),
                () -> assertEquals(search.searchInsert(nums, 0), 0),
                () -> assertEquals(search.searchInsert(number, 0), 0)
        );
    }

}