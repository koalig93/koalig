package pingwit.hw_8.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class InputExceptionMain {

    private static final int Y = 10;

    public static void main(String[] args) {
        generateArray();
    }

    private static void generateArray() {
        try {
            int size = askUserForInput();

            int[] array = new int[size];

            for (int i = 0; i < array.length; ++i) {
                array[i] = i;
            }
            System.out.println("generated array: " + Arrays.toString(array));

        } catch (InputException e) {
            System.out.println(e.getMessage());
            generateArray();
        }
    }

    private static int askUserForInput() throws InputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a future array size not greater than " + Y + ": ");

        int size = scanner.nextInt();
        if (size < 0) {
            throw new InputException("Array size cannot be negative");
        }
        if (size > Y) {
            throw new InputException("Array size cannot be greater than " + Y);
        }
        return size;
    }
}

class InputException extends Exception {
    InputException(String message) {
        super(message);
    }
}