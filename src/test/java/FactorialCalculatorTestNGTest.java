import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;

public class FactorialCalculatorTestNGTest {

    Factorial factoriall = new Factorial();

    @Test
    public void getPositiveFactorial() {
        assertEquals(120, factoriall.factorialCalculate(5));
    }

    @Test
    public void getZeroFactorial() {
        assertEquals(1, factoriall.factorialCalculate(0));
    }

    @Test
    public void getNegativeFactorial() {
        try {
            factoriall.factorialCalculate(-5);
            Assert.fail("Необходимо ввести положительное число");
        } catch (IllegalArgumentException e) {
        }
    }
}