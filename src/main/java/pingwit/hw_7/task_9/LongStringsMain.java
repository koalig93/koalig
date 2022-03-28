package pingwit.hw_7.task_9;

public class LongStringsMain {
    public static void main(String[] args) {
        String[] input = {"sdflksdj", "hello", "  trailing    ", "  ha     ","sdf", "sgjkd  slkjd", "xyz", " 1 ",
                "1234", "12345", "123456"};

        for (String str : input) {
            if (str.length() > 5) {
                System.out.println(str);
            }
        }
    }
}
