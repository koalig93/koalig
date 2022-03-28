package pingwit.hw_6.task_1;

//+
public class RecursiveFibonacci {
    public static void main(String[] args) {
        // 0 1 2 3 4 5 6  7  8 ...
        // 0 1 1 2 3 5 8 13 21 ...

        final int input = 7;

        System.out.println(calculateFibonacciExponentially(input));
        System.out.println(calculateFibonacciDynamic(input));
        System.out.println(calculateFibonacciAsLoop(input));
    }

    // Intuitive recursion but very-very bad exponential complexity
    // Сложность алгоритма сопоставима со значением числа Фибоначчи, т.к. рекурсия позволяет легко записать формулу для сложности
    // Time(n) = Time(n - 1) + Time(n - 2) + n const, Time(0) = Time(1) = const - ни что иное, как последовательность Фибоначчи,
    // таким образом, итоговая сложность O(2^n)
    private static int calculateFibonacciExponentially(int n) {
        if (n < 2) {
            return n;
        }
        return calculateFibonacciExponentially(n - 2) + calculateFibonacciExponentially(n - 1);
    }

    // Dynamic programming using additional memory (stores all the intermediate results).
    // Может показаться, что линейная сложность, но на самом деле квадратичная, т.к. числа Фибоначчи имеют порядок 2^n, т.е. n - бит,
    // соответственно операция сложения имеет не константную а линейную сложность O(n). Соответстенно, итоговая сложность будет
    // O(1 + 2 + ... + n) = O(n^2)
    private static int calculateFibonacciDynamic(int n) {
        int[] results = new int[n + 1];
        return calculateFibonacciDynamic(results, n);
    }

    private static int calculateFibonacciDynamic(int[] results, int n) {
        if (n < 2) {
            results[n] = n;
        } else if (results[n] == 0) {
            results[n] = calculateFibonacciDynamic(results, n - 2) +
                    calculateFibonacciDynamic(results, n - 1);
        }

        return results[n];
    }

    // Recursion as loop implementation
    // Также квадратичная сложность O(n^2)
    private static int calculateFibonacciAsLoop(int n) {
        if (n == 0) {
            return 0;
        }
        return calculateFibonacciAsLoop(0, 1, n);
    }

    private static int calculateFibonacciAsLoop(int a, int b, int n) {
        if (n == 1) {
            return b;
        }
        return calculateFibonacciAsLoop(b, a + b, n - 1);
    }
}
