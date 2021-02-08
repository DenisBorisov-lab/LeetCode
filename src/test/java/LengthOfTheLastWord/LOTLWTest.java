package LengthOfTheLastWord;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LOTLWTest {
    @Test
    public void firstTest(){
        LOTLW lotlw = new LOTLW();
        int answer = lotlw.lengthOfLastWord("Hello World");
        Assert.assertEquals(5, answer);
    }
    @Test
    public void secondTest(){
        LOTLW lotlw = new LOTLW();
        int answer = lotlw.lengthOfLastWord(" ");
        Assert.assertEquals(0, answer);
    }

}