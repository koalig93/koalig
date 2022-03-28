package pingwit.hw_7.task_4;

import java.util.HashMap;
import java.util.Map;

public class DictionaryMain {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning, players help is needed "
                + "to add some of the smaller features and content. Of course polishing the overall experience is "
                + "important at the same time. Game has been extensively tested in closed group, but it is always "
                + "important to hear fresh suggestions from larger crowd that come from various gaming backgrounds. "
                + "Plan is to make the game as good as possible but without compromising the core idea.";

        String[] words = {
                "alert", "add", "good", "plan"
        };

        Map<String, Integer> dictionary = countWords(text.toLowerCase(), words);

        System.out.println(dictionary);
    }

    private static Map<String, Integer> countWords(String text, String[] words) {
        Map<String, Integer> result = new HashMap<>();

        for (String word : words) {
            int counter = 0;
            for (int pos = text.indexOf(word); pos >= 0; pos = text.indexOf(word, pos + 1)) {
                counter++;
            }
            result.put(word, counter);
        }
        return result;
    }
}
