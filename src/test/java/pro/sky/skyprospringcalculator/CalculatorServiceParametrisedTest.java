package pro.sky.skyprospringcalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.skyprospringcalculator.CalculatorServiceTestConstants.*;

public class CalculatorServiceParametrisedTest {
    private final CalculatorService out = new CalculatorServiceImpl();
    int result;

    public static Stream<Arguments> provideParamsForTestsSum(){
        return Stream.of(
                Arguments.of(NUMBER1, NUMBER2, SUM_BETWEEN_NUMBER1_AND_NUMBER2),
                Arguments.of(NUMBER1, NEGATIVE_NUMBER2, SUM_BETWEEN_NUMBER1_AND_NEGATIVE_NUMBER2),
                Arguments.of(NEGATIVE_NUMBER1, NEGATIVE_NUMBER2, SUM_BETWEEN_NEGATIVE_NUMBER1_AND_NEGATIVE_NUMBER2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsSum")
    public void getSumTest(int number1, int number2, int expected){
        result = Integer.parseInt(out.getSum(number1, number2));
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideParamsForTestsDifference(){
        return Stream.of(
                Arguments.of(NUMBER1, NUMBER2, DIFFERENCE_BETWEEN_NUMBER1_AND_NUMBER2),
                Arguments.of(NUMBER1, NEGATIVE_NUMBER2, DIFFERENCE_BETWEEN_NUMBER1_AND_NEGATIVE_NUMBER2),
                Arguments.of(NEGATIVE_NUMBER1, NEGATIVE_NUMBER2, DIFFERENCE_BETWEEN_NEGATIVE_NUMBER1_AND_NEGATIVE_NUMBER2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsDifference")
    public void getDifferenceTest(int number1, int number2, int expected){
        result = Integer.parseInt(out.getDifference(number1, number2));
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideParamsForTestsMultiply(){
        return Stream.of(
                Arguments.of(NUMBER1, NUMBER2, MULTIPLY_BETWEEN_NUMBER1_AND_NUMBER2),
                Arguments.of(NUMBER1, NEGATIVE_NUMBER2, MULTIPLY_BETWEEN_NUMBER1_AND_NEGATIVE_NUMBER2),
                Arguments.of(NEGATIVE_NUMBER1, NEGATIVE_NUMBER2, MULTIPLY_BETWEEN_NEGATIVE_NUMBER1_AND_NEGATIVE_NUMBER2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsMultiply")
    public void getMultiplyTest(int number1, int number2, int expected){
        result = Integer.parseInt(out.getMultiply(number1, number2));
        assertEquals(expected, result);
    }

    public static Stream<Arguments> provideParamsForTestsDivide(){
        return Stream.of(
                Arguments.of(NUMBER1, NUMBER2, DIVIDE_BETWEEN_NUMBER1_AND_NUMBER2),
                Arguments.of(NUMBER1, NEGATIVE_NUMBER1, DIVIDE_BETWEEN_NUMBER1_AND_NEGATIVE_NUMBER1),
                Arguments.of(NEGATIVE_NUMBER2, NEGATIVE_NUMBER1, DIVIDE_BETWEEN_NEGATIVE_NUMBER2_AND_NEGATIVE_NUMBER1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestsDivide")
    public void getDivideTest(int number1, int number2, int expected){
        result = Integer.parseInt(out.getDivide(number1, number2));
        assertEquals(expected, result);
    }
}
