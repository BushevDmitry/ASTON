import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class FactorialCalculateTest {

    Factorial factorial = new Factorial();

    @Test
    public void getZeroFactorial() {
        assertEquals(1, factorial.factorialCalculate(0));
    }

    @Test
    public void getPositiveFactorial() {
        assertEquals(120, factorial.factorialCalculate(5));
    }

    @Test
    public void getNegativeFactorial() {
        try {
            factorial.factorialCalculate(-5);
            Assert.fail("Необходимо ввести положительное число");
        } catch (IllegalArgumentException e) {
        }
    }
}


