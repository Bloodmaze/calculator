package pro.sky.calculator.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;
import pro.sky.calculator.service.CalculatorServiceImpl;
import pro.sky.calculator.service.ZeroDivideException;

@RestController
@RequestMapping("/calculator")
public class HelloCalculator {
    private CalculatorServiceImpl calculatorServiceImpl=new CalculatorServiceImpl();

    @GetMapping()
    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String calculatorPlus(@RequestParam Integer num1, @RequestParam Integer num2) {
        Integer result =calculatorServiceImpl.sum(num1, num2);
        return massage(num1, num2, '+', result);
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorServiceImpl.minus(num1, num2);
        return massage(num1, num2, '-', result);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam int num1, @RequestParam int num2) {
        int result = calculatorServiceImpl.multiply(num1, num2);
        return massage(num1, num2, '*', result);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam int num1, @RequestParam int num2) throws ZeroDivideException {
        if (num2 == 0) {
            return "Деление на ноль невозможно!";
        } else {
            int result = calculatorServiceImpl.divide(num1, num2);

            return massage(num1, num2, '/', result);
        }
    }


    private String massage(int num1, int num2, char action, int result) {
        return String.format("<h1>%d %c %d = %d</h1>", num1, action, num2, result);
    }
}




