import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void TestCalcSum() {
        assertEquals(11, calculator.sum(5, 6), 0);
    }

    @Test
    public void TestCalcSubtract() {
        assertEquals(-1, calculator.subtract(8, 9), 0);
    }

    @Test
    public void TestCalcMultiply() {
        assertEquals(56, calculator.multiply(7, 8), 0);
    }

    @Test
    public void TestCalcDivide() {
        assertEquals(2, calculator.divide(16, 8), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void TestCalcDivideByZero() {
        calculator.divide(5, 0);
    }
}
