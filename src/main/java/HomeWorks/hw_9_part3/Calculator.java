package HomeWorks.hw_9_part3;

public class Calculator {


    public int minus(int a, int b) {
        return a - b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int[] numbers) {
        int result = 0;
        for (int a : numbers) {
            result += a;
        }
        return result;
    }

    public int sum(int firstNumber, int... otherNumbers) {
        int result = 0;
        for (int a : otherNumbers) {
            result += a;
        }
        return result + firstNumber;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Нельзя делить на ноль!");
            return 999999999;
        } else {
            return a / b;
        }
    }


}
