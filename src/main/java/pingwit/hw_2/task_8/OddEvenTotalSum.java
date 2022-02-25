package pingwit.hw_2.task_8;

public class OddEvenTotalSum {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        for (String arg: args) {
            int number = Integer.parseInt(arg);
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println("sum of evens: " + evenSum);
        System.out.println("sum of odds:  " + oddSum);
        System.out.println("total sum:    " + (evenSum + oddSum));
    }
}
