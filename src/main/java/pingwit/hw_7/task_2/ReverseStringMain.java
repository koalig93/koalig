package pingwit.hw_7.task_2;

public class ReverseStringMain {
    public static void main(String[] args) {
        String input = "alucard";

        System.out.println(reverseString(input));
    }

    private static String reverseString(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString();
    }
}