package pingwit.hw_7.task_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilterMain {
    public static void main(String[] args) {
        String[] array = {"Hello", "wing", "person", "Wheel", "java", "something", "word"};
        char symbol = 'w';

        String[] filteredArray = filter(array, symbol);
        System.out.println(Arrays.toString(filteredArray));
    }

    private static String[] filter(String[] array, char symbol) {
        List<String> filteredList = Arrays.stream(array)
                .filter(element -> element.toLowerCase().indexOf(symbol) == 0)
                .collect(Collectors.toList());

        return filteredList.toArray(String[]::new);
    }
}
