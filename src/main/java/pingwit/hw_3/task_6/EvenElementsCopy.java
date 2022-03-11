package pingwit.hw_3.task_6;

import java.util.Arrays;
import pingwit.hw_3.TestSet;

public class EvenElementsCopy {
    public static void main(String[] args) {
        for (int[] row : TestSet.getIntegerArrays()) {
            System.out.print(Arrays.toString(row) + " -> ");
            System.out.println(Arrays.toString(getEvenElements(row)));
        }
    }

    private static int[] getEvenElements(int[] numbers) { // задача пока решена неверно
        if (numbers == null) {
            return null;
        }

        int[] result = new int[numbers.length / 2]; // а почему ты решил что конечный массив будет х2 короче начального?
        // потому что мы оставляем только четные элементы массива, а их в 2 раза меньше (заодно проверил, что работает на массивах длины 0, 1, 2, 3)
        // возможно я неправаильно понимаю условие задачи, но для наглядности изменил вывод
        
        // четные элементы массива [33, 55, 77, 88] будут [88]. А ты взял четные индексы, это не то

        int j = 0;
        for (int i = 1; i < numbers.length; i += 2) {
            result[j++] = numbers[i];
        }

        return result;
    }
}
