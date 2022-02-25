package pingwit.hw_2.task_2;

public class AmoebaDivision {
    public static void main(String[] args) {
        long amoebaNum = 1;
        for (int i = 3; i <= 24; i += 3) { // 3 стоит вынести в переменную
            amoebaNum <<= 1; // зачем усложняешь? amoebaNum *= 2 проще же читать   
            System.out.println("number of amoebs after " + i + " hours: " + amoebaNum);
        }
    }
}
