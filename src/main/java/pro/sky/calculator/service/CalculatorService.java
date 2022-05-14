package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service

public interface CalculatorService {


    Integer sum(Integer num1, Integer num2);

    int minus(int num1, int num2);

    int multiply(int num1, int num2);

    int divide(int num1, int num2) throws ZeroDivideException;
}