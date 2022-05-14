package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Integer sum(Integer num1, Integer num2) {
        return num1 + num2;

    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) throws ZeroDivideException {
        if (num2 == 0) {
            throw new ZeroDivideException();
        }
        return num1 / num2;
    }
}
