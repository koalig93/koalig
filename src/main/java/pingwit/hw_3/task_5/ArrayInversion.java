package pingwit.hw_3.task_5;

import java.util.Arrays;
import pingwit.hw_3.TestSet;

public class ArrayInversion {

    public static void main(String[] args) {
        for (int[] row : TestSet.INTEGER_ARRAYS) {
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
            int temp = numbers[i]; //есть еще вариант свапа без 3ей переменной, я даже удивлен что ты не использовал его, ты ж знатный псих )) 
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }
}
