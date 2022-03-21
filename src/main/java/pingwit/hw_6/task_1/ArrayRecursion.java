package pingwit.hw_6.task_1;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] array = {25, 10, 5, 12, 33};

        printArray(array, 0);
    }

    private static void printArray(int[] array, int pos) {
        if (pos >= array.length) {
            return;
        }
        System.out.println(array[pos]);
        printArray(array, pos + 1);
    }
}
