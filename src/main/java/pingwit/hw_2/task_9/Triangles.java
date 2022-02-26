package pingwit.hw_2.task_9;

public class Triangles {
    // возможно не очень корректно написано условие задачи. На выходе должен был ромб получиться. Задание засчитаю как правильное
    public static void main(String[] args) {
        int height = 4;
        drawUpTriangle(height);
        System.out.println();
        drawDownTriangle(height);
    }

    private static void drawUpTriangle(int height) {
         for (int i = 0; i < height; ++i) {
             for (int j = i + 1; j < height; ++j) {
                 System.out.print(' ');
             }
             for (int j = 0; j <= i; ++j) {
                 System.out.print('*');
             }
             System.out.println();
         }
    }

    private static void drawDownTriangle(int height) {
        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print(' ');
            }
            for (int j = i; j < height; ++j) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
