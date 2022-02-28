package pingwit.hw_2.task_2;

public class AmoebaDivision {
    private static final int DIVISION_PERIOD = 3;

    public static void main(String[] args) {
        long amoebaNum = 1;
        for (int i = DIVISION_PERIOD; i <= 24; i += DIVISION_PERIOD) { // 3 стоит вынести в переменную
            // согласен, но я не помню, есть ли оптимизация в джаве, когда int умножается на 2?
            // вопрос интересный, потому что операция умножения дороже битовых операций
            amoebaNum <<= 1; // зачем усложняешь? amoebaNum *= 2 проще же читать
            System.out.println("number of amoebs after " + i + " hours: " + amoebaNum);
        }
    }
}
