package komaru.java.mavenByKomaru;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello() {
        return "Welcome to Komaru's Calculator!";
    }

    public String error() {
        return "Something went wrong!";
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Комару запрещает делить вам на ноль.");
        }
        return num1 / num2;
    }
}
