package assignments;

import org.junit.jupiter.api.Test;
// import Ex2.Cell;
import static org.junit.Assert.*;


public class CellTest1 {
    @Test
    void isNumberTest(){
        String k = "a";
        boolean a = SCell.isNumber(k);
        assertFalse(a);

        String l = "123v";
        boolean s = SCell.isNumber(l);
        assertFalse(s);

        String j = "123";
        boolean m = SCell.isNumber(j);
        assertTrue(m);

        String z = null;
        boolean y = SCell.isNumber(z);
        assertFalse(y);

    }

    @Test
    void isOpTest(){
        char k = 'a';
        boolean l = Cell1.isOp(k);
        assertFalse(l);

        char s = '/';
        boolean t = Cell1.isOp(s);
        assertTrue(t);

        char c = '+';
        boolean b = Cell1.isOp(c);
        assertTrue(b);
    }

    @Test
    void hoeManyOpTest(){
        String k = "1+3-2*4";
        int j = Cell1.howManyOp(k);
        assertEquals(j,3);

        String n = "1+3-2*4+5/5";
        int f = Cell1.howManyOp(n);
        assertEquals(f,5);
    }

    @Test
    void canBeComputeNowTest(){
        String t = "123";
        boolean k = Cell1.canBeComputeNow(t);
        assertTrue(k);

        String l = "12+3";
        boolean g = Cell1.canBeComputeNow(l);
        assertTrue(g);

        String w = "1+2+3";
        boolean q = Cell1.canBeComputeNow(w);
        assertTrue(q);

        String e = "1++3";
        boolean d = Cell1.canBeComputeNow(e);
        assertFalse(d);

    }
}
