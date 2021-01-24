package LongestSubstring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {
    @Test
    public void firstTest(){
        LongestSubstring go = new LongestSubstring();
        String str = "abcabcbb";
        int answer = go.lengthOfLongestSubstring(str);
        Assert.assertEquals(3, answer);
    }
    @Test
    public void secondTest(){
        LongestSubstring go = new LongestSubstring();
        String str = "bbbbb";
        int answer = go.lengthOfLongestSubstring(str);
        Assert.assertEquals(1, answer);
    }
    @Test
    public void thirdTest(){
        LongestSubstring go = new LongestSubstring();
        String str = "pwwkew";
        int answer = go.lengthOfLongestSubstring(str);
        Assert.assertEquals(3, answer);
    }
    @Test
    public void fourthTest(){
        LongestSubstring go = new LongestSubstring();
        String str = "";
        int answer = go.lengthOfLongestSubstring(str);
        Assert.assertEquals(0, answer);
    }
}