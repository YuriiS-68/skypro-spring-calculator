package pro.sky.skyprospringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.skyprospringcalculator.CalculatorServiceTestConstants.*;

public class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorServiceImpl();
    int result;

    @Test
    public void getSumTest(){
        result = Integer.parseInt(out.getSum(NUMBER1, NUMBER2));
        assertEquals(SUM_BETWEEN_NUMBER1_AND_NUMBER2, result);

        result = Integer.parseInt(out.getSum(NUMBER1, NEGATIVE_NUMBER2));
        assertEquals(SUM_BETWEEN_NUMBER1_AND_NEGATIVE_NUMBER2, result);

        result = Integer.parseInt(out.getSum(NEGATIVE_NUMBER1, NEGATIVE_NUMBER2));
        assertEquals(SUM_BETWEEN_NEGATIVE_NUMBER1_AND_NEGATIVE_NUMBER2, result);
    }

    @Test
    public void getDifference(){
        result = Integer.parseInt(out.getDifference(NUMBER1, NUMBER2));
        assertEquals(DIFFERENCE_BETWEEN_NUMBER1_AND_NUMBER2, result);

        result = Integer.parseInt(out.getDifference(NUMBER1, NEGATIVE_NUMBER2));
        assertEquals(DIFFERENCE_BETWEEN_NUMBER1_AND_NEGATIVE_NUMBER2, result);

        result = Integer.parseInt(out.getDifference(NEGATIVE_NUMBER1, NEGATIVE_NUMBER2));
        assertEquals(DIFFERENCE_BETWEEN_NEGATIVE_NUMBER1_AND_NEGATIVE_NUMBER2, result);
    }

    @Test
    public void getMultiply(){
        result = Integer.parseInt(out.getMultiply(NUMBER1, NUMBER2));
        assertEquals(MULTIPLY_BETWEEN_NUMBER1_AND_NUMBER2, result);

        result = Integer.parseInt(out.getMultiply(NUMBER1, NEGATIVE_NUMBER2));
        assertEquals(MULTIPLY_BETWEEN_NUMBER1_AND_NEGATIVE_NUMBER2, result);

        result = Integer.parseInt(out.getMultiply(NEGATIVE_NUMBER1, NEGATIVE_NUMBER2));
        assertEquals(MULTIPLY_BETWEEN_NEGATIVE_NUMBER1_AND_NEGATIVE_NUMBER2, result);
    }

    @Test
    public void getDivide(){
        result = Integer.parseInt(out.getDivide(NUMBER1, NUMBER2));
        assertEquals(DIVIDE_BETWEEN_NUMBER1_AND_NUMBER2, result);

        result = Integer.parseInt(out.getDivide(NUMBER1, NEGATIVE_NUMBER1));
        assertEquals(DIVIDE_BETWEEN_NUMBER1_AND_NEGATIVE_NUMBER1, result);

        result = Integer.parseInt(out.getDivide(NEGATIVE_NUMBER2, NEGATIVE_NUMBER1));
        assertEquals(DIVIDE_BETWEEN_NEGATIVE_NUMBER2_AND_NEGATIVE_NUMBER1, result);
    }

    @Test
    public void shouldArgumentExceptionWhenDivideZero(){
        assertThrows(IllegalArgumentException.class,
                () -> out.getDivide(FIRST_NUMBER, ZERO));
    }
}
