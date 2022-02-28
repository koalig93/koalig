package pingwit.hw_2.task_4;

public class IntegerMultiplication {
    public static void main(String[] args) {
        long a = Long.parseLong(args[0]);
        long b = Long.parseLong(args[1]);
        System.out.println(a + " * " + b + " = " + multiply(a, b));

        // On my machine my method with small numbers is faster than yours (as I expected:)
        // My method time: 1287 ms
        // Your method time: 6681 ms
        // Сорри, по привычке начал писать коммент на русском)
        // Как я уже говорил, маленькие значения времени не всегда хорошо сравнивать,
        // т.к. может быть куча факторов, которые сильно влияют на этот маленький промежуток времени,
        // а именно, погрешность 5 миллисекунд для результата в 8 миллисекунд, куда больнее,
        // чем погрешность 5 миллисекунд для результата в 1000 миллисекунд
        checkMyMethod(100_000_000, 101, 99);
        checkYourMethod(100_000_000, 101, 99);
    }

    private static long multiply(long a, long b) {
        boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0); // negative - это утверждение, лучше isNegative
        long result = multiplyPositives(Math.abs(a), Math.abs(b));
        return isNegative ? -result : result;
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

    private static long multiplyPositivesOrderedSimple(long a, long b) {
        long result = 0;
        for (long i = 0; i < b; ++i) {
            result += a;
        }
        return result;
    }


    private static void checkMyMethod(long numIterations, long a, long b) {
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < numIterations; ++i) {
            multiplyPositivesOrdered(a, b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("My method time: " + (endTime - startTime));
    }

    private static void checkYourMethod(long numIterations, long a, long b) {
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < numIterations; ++i) {
            multiplyPositivesOrderedSimple(a, b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Your method time: " + (endTime - startTime));
    }
}
