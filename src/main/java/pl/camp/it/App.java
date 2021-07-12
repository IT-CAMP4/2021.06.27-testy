package pl.camp.it;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.operations);

        calculator.add(2, 3);

        calculator = new Calculator();

        System.out.println(calculator.operations);

        calculator = new Calculator();

        calculator.multiply(3, 4);

        System.out.println(calculator.operations);
    }
}
