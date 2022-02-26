package pingwit.hw_2.task_7;

public class OddSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i += 2) { // 99 в переменную
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("the same as " + 50 * (1 + 99) / 2); // 99 стоит тоже вынести в переменную, чтобы привязать проверку к данным
    }
}
