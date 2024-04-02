package hw_9_part3;

import HomeWorks.hw_9_part3.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setUp(){
         calculator =new Calculator();
    }

    @Test
    void sumOfTwoNumbers(){
        int sum = calculator.sum(5,10);
        Assertions.assertEquals(15,sum);
    }
    @Test
    void sumOfArrayNumbers(){
        int[] array = {3, 5, 8};
        int sum = calculator.sum(array);
        Assertions.assertEquals(16,sum);
    }
    @Test
    void sumOfExtensiveList(){
        int sum = calculator.sum(5,2,8);
        Assertions.assertEquals(15,sum);
    }
    @Test
    void minus(){
        int minus = calculator.minus(10,3);
        Assertions.assertEquals(7,minus);
    }

    @Test
    void multiply(){
        int multiply = calculator.multiply(5,10);
        Assertions.assertEquals(50,multiply);
    }
    @Test
    void divide(){
        int divide = (int) calculator.divide(10,2);
        Assertions.assertEquals(5,divide);
    }
}
