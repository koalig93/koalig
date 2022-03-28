package pingwit.hw_7.task_1;

public class SplitStringMain {
    public static void main(String[] args) {
        String input = "engineering";

        int pos = input.indexOf("ring");
        String engine = input.substring(0, pos - 1);
        String ring = input.substring(pos);

        System.out.println(engine);
        System.out.println(ring);
    }
}
