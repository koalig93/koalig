package pingwit.hw_3.task_6;

import java.util.Arrays;
import pingwit.hw_3.TestSet;

public class EvenElementsCopy {


    public static void main(String[] args) {
        for (int[] row : TestSet.INTEGER_ARRAYS) {
            System.out.println(Arrays.toString(getEvenElements(row)));
        }
    }

    private static int[] getEvenElements(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        int[] result = new int[numbers.length / 2];

        int j = 0;
        for (int i = 1; i < numbers.length; i += 2) {
            result[j++] = numbers[i];
        }

        return result;
    }
}
