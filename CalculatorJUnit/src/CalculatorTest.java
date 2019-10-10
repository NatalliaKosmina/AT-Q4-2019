import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void TestCalc() {
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

    @Test
    public void TestNullB() {
        assertNotNull(double a);
    }

    @Test
    public void TestNullB() {
        assertNotNull();
    }

    @Test
    public void anyString() {
        assertTrue(true);
    }


    @Test(expected = ArithmeticException.class)
    public void divideTestExc(){
        Calculator calculator = new Calculator();
        calculator.divide();
    }
}
