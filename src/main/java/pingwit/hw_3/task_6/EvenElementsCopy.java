package pingwit.hw_3.task_6;

import java.util.Arrays;
import pingwit.hw_3.TestSet;

public class EvenElementsCopy {
    public static void main(String[] args) {
        for (int[] row : TestSet.getIntegerArrays()) {
            System.out.print(Arrays.toString(row) + " -> ");
            System.out.println(Arrays.toString(getEvenElements(row)));
        }
    }

    private static int[] getEvenElements(int[] numbers) { // задача пока решена неверно
        if (numbers == null) {
            return null;
        }

        int counter = 0;
        for (int element : numbers) {
            if (element % 2 == 0) {
                counter++;
            }
        }

        int[] result = new int[counter];
        int j = 0;
        for (int element : numbers) {
            if (element % 2 == 0) {
                result[j++] = element;
            }
        }

        return result;
    }
}
