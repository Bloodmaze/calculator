package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.service.CalculatorServiceImpl;
import pro.sky.calculator.service.ZeroDivideException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculator.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParameterTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSummation(int num1, int num2) {
        assertEquals(num1 + num2, out.sum(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMinus(int num1, int num2) {
        assertEquals(num1 - num2, out.minus(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMultiplication(int num1, int num2) {
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfDivision(int num1, int num2) throws ZeroDivideException {
        assertEquals(num1 / num2, out.divide(num1, num2));
    }

    private static Stream<Arguments> provideArgumentsForCalculatorTests() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ZERO, TWO),
                Arguments.of(ONE, ONE),
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO));

    }
}
