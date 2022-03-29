package pro.sky.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class HelloCalculator {

    @GetMapping()
    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String calculatorPlus(@RequestParam int num1, @RequestParam int num2) {
        int result = CalculatorService.sum(num1, num2);
        return massage(num1, num2, '+', result);
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam int num1, @RequestParam int num2) {
        int result = CalculatorService.minus(num1, num2);
        return massage(num1, num2, '-', result);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam int num1, @RequestParam int num2) {
        int result = CalculatorService.multiply(num1, num2);
        return massage(num1, num2, '*', result);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Деление на ноль невозможно!";
        } else {
            int result = CalculatorService.divide(num1, num2);

            return massage(num1, num2, '/', result);
        }
    }


    private String massage(int num1, int num2, char action, int result) {
        return String.format("<h1>%d %c %d = %d</h1>", num1, action, num2, result);
    }
}




