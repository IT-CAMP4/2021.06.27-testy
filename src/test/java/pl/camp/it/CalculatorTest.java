package pl.camp.it;

import org.junit.*;

public class CalculatorTest {

    static Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Konstruktor !!");
    }

    @Before
    public void przygotowanie() {
        System.out.println("Przygotowuję się !!");
    }

    @After
    public void zakonczenie() {
        System.out.println("Kończę !!");
    }

    @BeforeClass
    public static void przygotowaniePredTestami() {
        System.out.println("Przygotowanie do testów !!");
    }

    @AfterClass
    public static void czyszczeniePoTestach() {
        System.out.println("Czyszczenie po testach !!");
    }

    @Test
    public void addTest() {
        int a = 5;
        int b = 5;
        int expectedResult = 10;

        int result = calculator.add(a, b);

        System.out.println(calculator.operations);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiplyTest() {
        int a = 3;
        int b = 4;
        int expectedResult = 12;

        int result = calculator.multiply(a, b);

        System.out.println(calculator.operations);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void divideTest() {
        int a = 4;
        int b = 2;
        double expectedResult = 2.0;

        double result = calculator.divide(a, b);

        System.out.println(calculator.operations);
        Assert.assertEquals(expectedResult, result, 0.0);
    }

    @Test
    public void divideByNegativeTest() {
        int a = 4;
        int b = -2;
        double expectedResult = -2.0;

        double result = calculator.divide(a, b);

        System.out.println(calculator.operations);
        Assert.assertEquals(expectedResult, result, 0.00001);
    }

    @Test
    public void divideWithTwoNegativeTest() {
        int a = -4;
        int b = -2;
        double expectedResult = 2.0;

        double result = calculator.divide(a, b);

        System.out.println(calculator.operations);
        Assert.assertEquals(expectedResult, result, 0.00001);
    }

    @Test
    public void divideWithZeroATest() {
        int a = 0;
        int b = 2;
        double expectedResult = 0.0;

        double result = calculator.divide(a, b);

        System.out.println(calculator.operations);
        Assert.assertEquals(expectedResult, result, 0.00001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest() {
        int a = 5;
        int b = 0;

        calculator.divide(a, b);

        System.out.println(calculator.operations);
    }

    @Test
    public void divideWithFloatingPointResultTest() {
        int a = 5;
        int b = 2;
        double expectedResult = 2.5;

        double result = calculator.divide(a, b);

        System.out.println(calculator.operations);
        Assert.assertEquals(expectedResult, result, 0.000001);
    }
}
