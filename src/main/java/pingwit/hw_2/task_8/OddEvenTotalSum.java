package pingwit.hw_2.task_8;

public class OddEvenTotalSum {
    public static void main(String[] args) { // старайся отделать абзацами логические блоки, так код проще читать
        int evenSum = 0;
        int oddSum = 0; // здесь лучше абзац
        for (String arg: args) {
            int number = Integer.parseInt(arg);
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        } // здесь лучше абзац
        System.out.println("sum of evens: " + evenSum);
        System.out.println("sum of odds:  " + oddSum);
        System.out.println("total sum:    " + (evenSum + oddSum));
    }
}
