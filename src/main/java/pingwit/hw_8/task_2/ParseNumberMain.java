package pingwit.hw_8.task_2;

public class ParseNumberMain {
    public static void main(String[] args) {
        System.out.println(parseIntegerNumber("10"));
        System.out.println(parseIntegerNumber("-25"));
        System.out.println(parseIntegerNumber("2147483647"));
        System.out.println(parseIntegerNumber("2147483648"));
        System.out.println(parseIntegerNumber(""));
        System.out.println(parseIntegerNumber("invalid number"));
    }

    private static int parseIntegerNumber(String stringNumber) {
        try {
            return Integer.parseInt(stringNumber);
        } catch (NumberFormatException e) {
            System.out.println("Wrong integer number format: " + e.getMessage());
            return 0;
        }
    }
}
