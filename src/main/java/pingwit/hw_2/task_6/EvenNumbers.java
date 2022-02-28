package pingwit.hw_2.task_6;

public class EvenNumbers {

    private static final int FOMIN_MAGIC_NUMBER = 100;

    public static void main(String[] args) {
        for (int i = 2; i <= FOMIN_MAGIC_NUMBER; i += 2) { // 100 - лучше в переменную
            System.out.println(i);
        }
    }
}
