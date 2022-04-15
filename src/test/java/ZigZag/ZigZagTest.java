package ZigZag;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ZigZagTest {

    @Test
    void firstTest() {
        ZigZag zigZag = new ZigZag();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        Assert.assertEquals("PAHNAPLSIIGYIR", zigZag.convert(s, numRows));
    }

    @Test
    void secondTest() {
        ZigZag zigZag = new ZigZag();
        String s = "AB";
        int numRows = 1;
        Assert.assertEquals("AB", zigZag.convert(s, numRows));
    }


}