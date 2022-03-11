package pingwit.hw_3.task_5;

import java.util.Arrays;
import pingwit.hw_3.TestSet;

public class ArrayInversion {

    public static void main(String[] args) {
        for (int[] row : TestSet.getIntegerArrays()) {
            printInversed(row);
        }
    }

    private static void printInversed(int[] numbers) {
        inverse(numbers);
        System.out.println("inversed: " + Arrays.toString(numbers));
    }

    private static void inverse(int[] numbers) {
        if (numbers == null) {
            return;
        }

        int median = numbers.length / 2;
        for (int i = 0; i < median; ++i) {
            int j = numbers.length - 1 - i;
//            int temp = numbers[i]; //есть еще вариант свапа без 3ей переменной, я даже удивлен что ты не использовал его, ты ж знатный псих ))
//            numbers[i] = numbers[j];
//            numbers[j] = temp;

            numbers[i] ^= numbers[j]; // раз ты так просишь (пояснение внизу, что это сложная штука и не для психов)
            numbers[j] ^= numbers[i];
            numbers[i] ^= numbers[j];
        }
    }
}

//    swap по битам - то, что мы хотим получить
//    a b -> b a
//    1 1 -> 1 1
//    1 0 -> 0 1
//    0 1 -> 1 0
//    0 0 -> 0 0
//
//    a ^ b - операция взаимоисключающего или
//    1 1 -> 0
//    1 0 -> 1
//    0 1 -> 1
//    0 0 -> 0
//
//    a ^= b, b ^= a, a ^= b - проверяем по битам последовательность наших операций
//    1 1 -> 0 1 -> 0 1 -> 1 1
//    1 0 -> 1 0 -> 1 1 -> 0 1
//    0 1 -> 1 1 -> 1 0 -> 1 0
//    0 0 -> 0 0 -> 0 0 -> 0 0