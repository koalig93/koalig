package pingwit.hw_3.task_9;

import java.util.Arrays;
import pingwit.hw_3.TestSet;

public class QuickSort {
    public static void main(String[] args) {
        for (int[] row : TestSet.getIntegerArrays()) {
            System.out.print(Arrays.toString(row) + " -> ");
            int comparesNum = quickSort(row);
            System.out.println(Arrays.toString(row) + " : " + comparesNum);
        }
    }

    private static int quickSort(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }

        return quickSort(array, 0, array.length - 1);
    }

    private static int quickSort(int[] array, int left, int right) {
        int counter = 0;

        int i = left;
        int j = right;
        int m = array[(i + j) / 2];
        do {
            ++counter;
            while (array[i] < m) {
                ++i;
                ++counter;
            }
            ++counter;
            while (m < array[j]) {
                --j;
                ++counter;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                ++i;
                --j;
            }
        } while (i <= j);

        if (i < right) {
            counter += quickSort(array, i, right);
        }
        if (left < j) {
            counter += quickSort(array, left, j);
        }
        return counter;
    }
}
