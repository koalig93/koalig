package pingwit.hw_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TestSet {

    private static final String SOURCE_DIR = "src/main/resources/pingwit/hw_3/test_set.txt";

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getIntegerArrays()));
    }

    public static int[][] getIntegerArrays() {
        int[][] result;
        try (FileInputStream fis = new FileInputStream(SOURCE_DIR)) {
            Scanner scanner = new Scanner(fis);

            int size = scanner.nextInt();
            result = new int[size + 1][];

            for (int i = 0; i < size; ++i) {
                int length = scanner.nextInt();

                result[i] = new int[length];
                for (int j = 0; j < length; ++j) {
                    result[i][j] = scanner.nextInt();
                }
            }

            result[size] = null;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            result = null;
        }
        return result;
    }
}
