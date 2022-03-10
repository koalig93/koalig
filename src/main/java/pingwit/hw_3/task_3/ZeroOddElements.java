package pingwit.hw_3.task_3;

import java.util.Arrays;
import pingwit.hw_3.TestSet;

public class ZeroOddElements {
    public static void main(String[] args) {
        for (int[] row : TestSet.INTEGER_ARRAYS) {
            replaceOddsByZero(row);
            System.out.println(Arrays.toString(row));
        }
    }

    private static void replaceOddsByZero(int[] numbers) {

        if (numbers == null) {
            return;
        }

        // We assume that the first element of array is odd, the second is even and so on
        for (int i = 0; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }
    }
}
