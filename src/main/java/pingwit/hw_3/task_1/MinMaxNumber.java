package pingwit.hw_3.task_1;

import java.util.Scanner;

public class MinMaxNumber {

    // Для человека, который борется за алгоритмы у тебя задача решена двумя нерациональными способами, за 1 итерацию все же можно сделать, зачем так оверхедить?
    // Я подумал, что тебе так больше понравится)

    private static final int INPUT_LENGTH = 3;

    public static void main(String[] args) {

        int[] numbers = new int[INPUT_LENGTH];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; ++i) {
            System.out.print("Input number #" + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = min;

        for (int i = 1; i < numbers.length; ++i) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println();
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }
}
