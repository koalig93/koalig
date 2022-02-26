package pingwit.hw_2.task_4;

public class IntegerMultiplication {
    public static void main(String[] args) {
        long a = Long.parseLong(args[0]);
        long b = Long.parseLong(args[1]);
        System.out.println(a + " * " + b + " = " + multiply(a, b));
    }

    private static long multiply(long a, long b) {
        boolean negative = (a < 0 && b > 0) || (a > 0 && b < 0); // negative - это утверждение, лучше isNegative
        long result = multiplyPositives(Math.abs(a), Math.abs(b));
        return negative ? -result : result;
    }

    // a >= 0 and b >= 0
    private static long multiplyPositives(long a, long b) {
        if (a < b) {
            return multiplyPositivesOrdered(b, a);
        } else {
            return multiplyPositivesOrdered(a, b);
        }
    }

    // the key algorithm for multiplication without '*' operation (O(n^2))
    // use ordering for better performance
    // a >= b >= 0
    // у тебя простая задача решена очень сложным способом. Боже упаси если ее увидят другие. 
    // Но работает очень быстро с большими числами и медленнее с небольшими
    private static long multiplyPositivesOrdered(long a, long b) {
        long result = 0;
        while (b > 0) {
            if ((b & 1) == 1) { 
                result += a;
            }
            a <<= 1;
            b >>= 1;
        }
        return result;
    }
}
