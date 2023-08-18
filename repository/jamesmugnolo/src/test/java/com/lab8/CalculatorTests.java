package com.lab8;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    private final Calculator math_calculator = new Calculator();
    @Test
    void addFloatNumsNormal() {
        Assertions.assertEquals(7, math_calculator.Add((float)3.5,(float)3.5));
    }
    @Test
    void subFloatNumsNormal() {
        Assertions.assertEquals(0, math_calculator.Subtract((float)3.25,(float)3.25));
    }
    @Test
    void multiplyFloatNumsNormal() {
        Assertions.assertEquals(9, math_calculator.Multiply((float)3,(float)3));
    }
    @Test
    void divideFloatNumsNormal() {
        Assertions.assertEquals(3, math_calculator.Divide((float)3,(float)1));
    }
}
