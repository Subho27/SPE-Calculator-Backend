package com.example.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
@CrossOrigin(origins = "http://16.171.181.71:8084")
public class HomeController {

    @GetMapping("/square-root")
    public double calculateSquareRoot(@RequestParam double number) {
        return Math.sqrt(number);
    }

    @GetMapping("/factorial")
    public long calculateFactorial(@RequestParam int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @GetMapping("/natural-log")
    public double calculateNaturalLog(@RequestParam double number) {
        return Math.log(number);
    }

    @GetMapping("/power")
    public double calculatePower(@RequestParam double base, @RequestParam double exponent) {
        return Math.pow(base, exponent);
    }
}

