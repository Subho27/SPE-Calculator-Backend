package com.example.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class HomeController {

    @GetMapping("/square-root/{number}")
    public double calculateSquareRoot(@PathVariable double number) {
        return Math.sqrt(number);
    }

    @GetMapping("/factorial/{number}")
    public long calculateFactorial(@PathVariable int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @GetMapping("/natural-log/{number}")
    public double calculateNaturalLog(@PathVariable double number) {
        return Math.log(number);
    }

    @GetMapping("/power")
    public double calculatePower(@RequestParam double number, @RequestParam double exponent) {
        return Math.pow(number, exponent);
    }
}

