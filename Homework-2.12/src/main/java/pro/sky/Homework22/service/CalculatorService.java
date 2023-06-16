package pro.sky.Homework22.service;

import org.springframework.stereotype.Service;
import pro.sky.Homework22.exception.MyIllegalArgumentException;

@Service
public class CalculatorService {
    public Number plus(int a, int b) {
        return a + b;
    }
    public Number minus(int a, int b) {
        return a - b;
    }
    public Number multiply(int a, int b) {
        return a * b;
    }
    public Number divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return (double) a / b;
    }
}
