package pl.camp.it;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        int a = 5;
        int b = 5;
        Calculator calculator = new Calculator();
        int expectedResult = 10;

        int result = calculator.add(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyTest() {
        int a = 3;
        int b = 4;
        Calculator calculator = new Calculator();
        int expectedResult = 12;

        int result = calculator.multiply(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void divideTest() {
        int a = 4;
        int b = 2;
        Calculator calculator = new Calculator();
        double expectedResult = 2.0;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.0);
    }

    @Test
    public void divideByNegativeTest() {
        int a = 4;
        int b = -2;
        Calculator calculator = new Calculator();
        double expectedResult = -2.0;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.00001);
    }

    @Test
    public void divideWithTwoNegativeTest() {
        int a = -4;
        int b = -2;
        Calculator calculator = new Calculator();
        double expectedResult = 2.0;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.00001);
    }

    @Test
    public void divideWithZeroATest() {
        int a = 0;
        int b = 2;
        Calculator calculator = new Calculator();
        double expectedResult = 0.0;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest() {
        int a = 5;
        int b = 0;
        Calculator calculator = new Calculator();

        calculator.divide(a, b);
    }

    @Test
    public void divideWithFloatingPointResultTest() {
        int a = 5;
        int b = 2;
        Calculator calculator = new Calculator();
        double expectedResult = 2.5;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.000001);
    }
}
