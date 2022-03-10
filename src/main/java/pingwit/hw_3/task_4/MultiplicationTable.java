package pingwit.hw_3.task_4;

public class MultiplicationTable {

    private static final int TABLE_SIZE = 9;

    public static void main(String[] args) {

        if (TABLE_SIZE <= 0) {
            return;
        }

        int[][] table = new int[TABLE_SIZE][TABLE_SIZE];

        for (int j = 0; j < table[0].length; ++j) {
            table[0][j] = j + 1;
        }
        for (int i = 1; i < table.length; ++i) {
            for (int j = 0; j < table[i].length; ++j) {
                table[i][j] = table[0][i] * table[0][j];
            }
        }

        for (int[] row : table) {
            for (int element : row) {
                if (element < 10) {
                    System.out.print(' ');
                }
                System.out.print(" " + element);
            }
            System.out.println();
        }
    }
}
