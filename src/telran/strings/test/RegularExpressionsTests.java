package telran.strings.test;

import org.junit.jupiter.api.Test;
import telran.strings.RegularExpressions;

import static org.junit.jupiter.api.Assertions.*;

public class RegularExpressionsTests {

    @Test
    void javaVariableTrueTest() {
        String regex = RegularExpressions.javaVariable();
        assertTrue("abs".matches(regex));
        assertTrue("a".matches(regex));
        assertTrue("$".matches(regex));
        assertTrue("$123".matches(regex));
        assertTrue("$12_3".matches(regex));
        assertTrue("abs_".matches(regex));
        assertTrue("__".matches(regex));
        assertTrue("Abs_".matches(regex));
    }

    @Test
    void javaVariableFalseTest() {
        String regex = RegularExpressions.javaVariable();
        assertFalse("1abc".matches(regex));
        assertFalse("_".matches(regex));
        assertFalse("a-2".matches(regex));
        assertFalse(" ".matches(regex));
        assertFalse("a 2".matches(regex));
        assertFalse("a?2".matches(regex));
    }

    @Test
    void zero_300TrueTest(){
        String regex = RegularExpressions.zero_300();
        assertTrue("0".matches(regex));
        assertTrue("1".matches(regex));
        assertTrue("19".matches(regex));
        assertTrue("198".matches(regex));
        assertTrue("300".matches(regex));
        assertTrue("299".matches(regex));
        assertTrue("30".matches(regex));
        assertTrue("33".matches(regex));
    }

    @Test
    void zero_300FalseTest(){
        String regex = RegularExpressions.zero_300();
        assertFalse("00".matches(regex));
        assertFalse("01".matches(regex));
        assertFalse("000".matches(regex));
        assertFalse("19s".matches(regex));
        assertFalse("398".matches(regex));
        assertFalse("2990".matches(regex));
        assertFalse("-30".matches(regex));
        assertFalse("330".matches(regex));
        assertFalse("301".matches(regex));
    }

    @Test
    void ipOctetTrueTest(){
        String regex = RegularExpressions.ipOctet();
        assertTrue("000".matches(regex));
        assertTrue("00".matches(regex));
        assertTrue("0".matches(regex));
        assertTrue("100".matches(regex));
        assertTrue("10".matches(regex));
        assertTrue("119".matches(regex));
        assertTrue("199".matches(regex));
        assertTrue("099".matches(regex));
        assertTrue("255".matches(regex));
        assertTrue("250".matches(regex));
        assertTrue("249".matches(regex));
    }

    @Test
    void ipOctetFalseTest(){
        String regex = RegularExpressions.ipOctet();
        assertFalse("-0".matches(regex));
        assertFalse("00 ".matches(regex));
        assertFalse("1900".matches(regex));
        assertFalse("299".matches(regex));
        assertFalse("00a".matches(regex));
        assertFalse("256".matches(regex));
        assertFalse("300".matches(regex));
    }

    @Test
    void mobileIsraelPhoneTest(){
        String regex = RegularExpressions.mobileIsraelPhone();
        assertTrue("+972539999999".matches(regex));
        assertTrue("+972-539999999".matches(regex));
        assertTrue("+972-539999999".matches(regex));
        assertTrue("0539999999".matches(regex));
        assertTrue("0535687912".matches(regex));
        assertTrue("053-99-99-999".matches(regex));
        assertTrue("05399-99-999".matches(regex));
        assertTrue("053-9999999".matches(regex));

        assertFalse("972539999999".matches(regex));
        assertFalse("9725399b9999".matches(regex));
        assertFalse("+973539999999".matches(regex));
        assertFalse("-97353999999".matches(regex));
        assertFalse("+9725399999998".matches(regex));
        assertFalse("0539-999999".matches(regex));
        assertFalse("0639999999".matches(regex));
        assertFalse("053a999999".matches(regex));
    }
}
