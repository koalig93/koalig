package pingwit.hw_3.task_7;

import java.util.Arrays;
import pingwit.hw_3.TestSet;

public class BubbleSort {
    public static void main(String[] args) {
        for (int[] row : TestSet.getIntegerArrays()) {
            System.out.print(Arrays.toString(row) + " -> ");
            int comparesNum = bubbleSort(row);
            System.out.println(Arrays.toString(row) + " : " + comparesNum);
        }
    }

    private static int bubbleSort(int[] array) {
        if (array == null || array.length < 2) {
            return 0;
        }

        int comparesNum = 0;
        for (int lastElem = array.length - 1; lastElem > 0; lastElem--) {
            boolean sorted = true;

            for (int i = 0; i < lastElem; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    sorted = false;
                }

                comparesNum++;
            }

            if (sorted) {
                break;
            }
        }
        return comparesNum;
    }
}
