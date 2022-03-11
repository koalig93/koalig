package pingwit.hw_3.task_1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxNumber {

    // Для человека, который борется за алгоритмы у тебя задача решена двумя нерациональными способами, за 1 итерацию все же можно сделать, зачем так оверхедить?
    private static final int INPUT_LENGTH = 3;

    public static void main(String[] args) {

        int[] numbers = new int[INPUT_LENGTH];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; ++i) {
            System.out.print("Input number #" + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Min number: " + getMin(numbers));
        System.out.println("Max number: " + getMax(numbers));

        List<Integer> numbersList = Arrays.stream(numbers).boxed().collect(Collectors.toList()); // .collect(Collectors.toList()) -> .toList()
        System.out.println();
        System.out.println("Alternative"); // System.out.println("\nAlternative"); вместо лишнего System.out.println();
        System.out.println("Min number: " + Collections.min(numbersList));
        System.out.println("Max number: " + Collections.max(numbersList));
    }

    private static int getMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return Integer.MAX_VALUE;
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; ++i) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        return max;
    }

    private static int getMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return Integer.MIN_VALUE;
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; ++i) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        return min;
    }
}
