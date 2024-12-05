package komaru.java.mavenByKomaru;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService CalculatorService;

    public CalculatorController(CalculatorService CalculatorService) {
        this.CalculatorService = CalculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return CalculatorService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                    @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба значения num должны быть введены для корректной работы.";
        }

        try {
            return num1 + " + " + num2 + " = " + String.valueOf(CalculatorService.plus(num1, num2));
        } catch (ArithmeticException e) {
            return "Ошибка: " + e.getMessage();
        }
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                     @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба значения num должны быть введены для корректной работы.";
        }

        try {
            return num1 + " - " + num2 + " = " + String.valueOf(CalculatorService.minus(num1, num2));
        } catch (ArithmeticException e) {
            return "Ошибка: " + e.getMessage();
        }
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба значения num должны быть введены для корректной работы.";
        }

        try {
            return num1 + " * " + num2 + " = " + String.valueOf(CalculatorService.multiply(num1, num2));
        } catch (ArithmeticException e) {
            return "Ошибка: " + e.getMessage();
        }
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Оба значения num должны быть введены для корректной работы.";
        }

        try {
            return num1 + " / " + num2 + " = " + String.valueOf(CalculatorService.divide(num1, num2));
        } catch (ArithmeticException e) {
            return "Ошибка: " + e.getMessage();
        }
    }
}