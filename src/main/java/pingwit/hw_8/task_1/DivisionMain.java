package pingwit.hw_8.task_1;

// +
public class DivisionMain {
    public static void main(String[] args) {
        double x = 15.5;
        double[] quotients = {1.0, -4.4, 0.0, 100.0, 0.0, -11.1};

        for (double quotient : quotients) {
            System.out.print(x + " / " + quotient + " = ");
            try {
                System.out.println(divide(x, quotient));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static double divide(double a, double b) throws ArithmeticException {
        if (Math.abs(b) < Double.MIN_VALUE) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
