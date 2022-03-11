package pingwit.hw_3.task_10;

public class BinarySearch {
    private static final int[] INPUT_ARRAY = {1, 4, 7, 8, 11, 23, 25, 33, 45, 88, 99};
    private static final int[][] NUMBERS_TO_SEARCH = {{0, -1}, {100, -1}, {34, -1}, {1, 0}, {11, 4}, {88, 9}, {99, 10}};

    public static void main(String[] args) {
        for (int[] numbersToSearch : NUMBERS_TO_SEARCH) {
            int index = binarySearch(INPUT_ARRAY, numbersToSearch[0]);
            System.out.print("index found: " + index);
            System.out.println(", check index: " + numbersToSearch[1]);
        }
    }

    private static int binarySearch(int[] array, int desired) {
        if (array == null) {
            return -1;
        }
        return binarySearch(array, 0, array.length - 1, desired);
    }

    private static int binarySearch(int[] array, int left, int right, int desired) {
        if (right < left) {
            return -1;
        }

        int middle = (left + right) / 2;
        if (desired < array[middle]) {
            return binarySearch(array, left, middle - 1, desired);
        }
        if (desired > array[middle]) {
            return binarySearch(array, middle + 1, right, desired);
        }
        return middle;
    }
}
