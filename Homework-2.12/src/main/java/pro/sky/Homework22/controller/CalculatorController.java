package pro.sky.Homework22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Homework22.service.CalculatorService;

import static org.apache.coyote.http11.Constants.a;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d + %d = %d", a, b, service.plus(a, b));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d - %d = %d", a, b, service.minus(a, b));
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d * %d = %d", a, b, service.multiply(a, b));
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return String.format("%d / %d = %d", a, b, service.divide(a, b));
    }
}




