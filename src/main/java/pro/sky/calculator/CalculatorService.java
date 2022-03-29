package pro.sky.calculator;

public interface CalculatorService {
    static int sum(int num1, int num2) {
        return num1 + num2;

    }

    static int minus(int num1, int num2) {
        return num1 - num2;

    }

    static int multiply(int num1, int num2) {
        return num1 * num2;

    }

    static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
