package pingwit.hw_2.task_7;

public class OddSum {

    private static final int INPUT_NUMBER = 99;

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= INPUT_NUMBER; i += 2) { // 99 в переменную
            sum += i;
        }
        System.out.println("sum = " + sum);

        // ответ является квадратом следующего выражения, но каждый множитель имеет разный смысл,
        // поэтому я их разделяю
        int numberOfOdds = (1 + INPUT_NUMBER) / 2;
        int averageValue = (1 + INPUT_NUMBER) / 2;
        System.out.println("the same as " + numberOfOdds * averageValue); // 99 стоит тоже вынести в переменную, чтобы привязать проверку к данным
    }
}
