package SimplifyPath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {
    @Test
    void test(){
        final SimplifyPath path = new SimplifyPath();
        assertAll(
                ()-> assertEquals(path.simplifyPath("/home/"), "/home"),
                ()-> assertEquals(path.simplifyPath("/../"), "/"),
                () -> assertEquals(path.simplifyPath("/home//foo/"), "/home/foo"),
                () -> assertEquals(path.simplifyPath("/a/./b/../../c/"), "/c")
        );
    }

}