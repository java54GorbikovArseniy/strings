package telran.strings.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import telran.strings.RegularExpressions;
import telran.strings.Validations;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationsTest {

    @Test
    void testIsArithmeticExpression() {
        //TODO
        assertTrue(Validations.isArithmeticExpression("(2 + 3)"));
        assertTrue(Validations.isArithmeticExpression("((2 + 3))"));
        assertTrue(Validations.isArithmeticExpression("2 + 3 * (34 - 5)"));

        assertFalse(Validations.isArithmeticExpression("(2 + 3"));
        assertFalse(Validations.isArithmeticExpression("2 + 3)"));
        assertFalse(Validations.isArithmeticExpression("(2 + 3))"));
        assertFalse(Validations.isArithmeticExpression("((2 + 3)"));
        assertFalse(Validations.isArithmeticExpression("(a + b)) * ((b + a)"));

//        assertFalse(Validations.isArithmeticExpression("")); //This wasn't in the exercise, but I think it would be great to add a check to see if the string is empty or not.
    }
}
