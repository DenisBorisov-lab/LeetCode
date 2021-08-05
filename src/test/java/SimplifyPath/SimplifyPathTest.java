package SimplifyPath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {
    @Test
    void test(){
        final SimplifyPath path = new SimplifyPath();
        assertAll(
                ()-> assertEquals(path.simple("/home/"), "/home"),
                ()-> assertEquals(path.simple("/../"), "/"),
                () -> assertEquals(path.simple("/home//foo/"), "/home/foo"),
                () -> assertEquals(path.simple("/a/./b/../../c/"), "/c")
        );
    }

}