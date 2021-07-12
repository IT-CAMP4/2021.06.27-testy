package pl.camp.it;

public class Calculator {

    int operations = 0;

    public int add(int a, int b) {
        this.operations++;
        return a+b;
    }

    public int multiply(int a, int b) {
        this.operations++;
        return a*b;
    }

    public double divide(int a, int b) {
        this.operations++;
        if(b == 0) {
            throw new IllegalArgumentException();
        }
        return ((double) a) / ((double) b);
    }
}
