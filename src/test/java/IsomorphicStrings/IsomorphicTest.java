package IsomorphicStrings;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicTest {
    @Test
    public void firstTest(){
        Isomorphic isomorphic = new Isomorphic();
        boolean isomorphic1 = isomorphic.isIsomorphic("egg", "add");
        Assert.assertEquals(true, isomorphic1);
    }
    @Test
    public void secondTest(){
        Isomorphic isomorphic = new Isomorphic();
        boolean isomorphic1 = isomorphic.isIsomorphic("foo", "bar");
        Assert.assertEquals(false, isomorphic1);
    }

    @Test
    public void thirdTest(){
        Isomorphic isomorphic = new Isomorphic();
        boolean isomorphic1 = isomorphic.isIsomorphic("paper", "title");
        Assert.assertEquals(true, isomorphic1);
    }

    @Test
    public void fourthTest(){
        Isomorphic isomorphic = new Isomorphic();
        boolean isomorphic1 = isomorphic.isIsomorphic("badc", "baba");
        Assert.assertEquals(false, isomorphic1);
    }


}