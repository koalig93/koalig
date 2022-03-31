package pingwit.hw_9.task_1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteArrayToFileMain {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("src/main/java/pingwit/hw_9/task_1/file.txt")) {

            int[] array = {1, 1, 2, 3, 5, 8, 13, 21};
            fw.write(Arrays.toString(array));

            fw.flush();
        } catch (IOException ignored) {
        }
    }
}
