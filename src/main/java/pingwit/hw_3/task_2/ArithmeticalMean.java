package pingwit.hw_3.task_2;

import pingwit.hw_3.TestSet;

public class ArithmeticalMean {

    public static void main(String[] args) {
        for (int[] numbersArray : TestSet.INTEGER_ARRAYS) {
            printArithmeticMean(numbersArray);
        }
    }

    private static void printArithmeticMean(int[] numbers) {
        System.out.println("Arithmetical mean: " + getArithmeticMean(numbers));
    }

    private static double getArithmeticMean(int[] numbers) {
        double mean = 0;

        if (numbers != null && numbers.length > 0) {
            for (int number : numbers) {
                mean += number;
            }
            mean /= numbers.length;
        }

        return mean;
    }
}
