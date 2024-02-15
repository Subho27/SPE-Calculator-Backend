package com.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {

    @InjectMocks
    HomeController homeController;

    //Doing the setup first
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateSquareRoot() {
        double number = 16.0;
        double expectedResult = 4.0;

        assertEquals(expectedResult, homeController.calculateSquareRoot(number));
    }

    @Test
    public void testCalculateFactorial() {
        int number = 5;
        long expectedResult = 120;

        assertEquals(expectedResult, homeController.calculateFactorial(number));
    }

    @Test
    public void testCalculateNaturalLog() {
        double number = 10.0;
        double expectedResult = 2.302585092994046;

        assertEquals(expectedResult, homeController.calculateNaturalLog(number));
    }

    @Test
    public void testCalculatePower() {
        double base = 2.0;
        double exponent = 3.0;
        double expectedResult = 8.0;

        assertEquals(expectedResult, homeController.calculatePower(base, exponent));
    }
}
