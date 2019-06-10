import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(12.00, 9.00);
    }

    @Test
    public void theCalculatorCanAddTwoNumbers(){
        assertEquals(21.00, calculator.add());
    }

    @Test
    public void theCalculatorCanSubtractTwoNumbers(){
        assertEquals(3.00, calculator.subtract());
    }

    @Test
    public void theCalculatorCanMultiplyTwoNumbers(){
        assertEquals(108.00, calculator.multiply());
    }

    @Test
    public void theCalculatorCanDivideTwoNumbers(){
        assertEquals(1.33, calculator.divide(), 0.01);
    }

}
