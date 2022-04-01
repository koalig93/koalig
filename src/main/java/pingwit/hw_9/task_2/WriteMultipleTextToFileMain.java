package pingwit.hw_9.task_2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteMultipleTextToFileMain {

    public static final String OUTPUT_FILE = "src/main/java/pingwit/hw_9/task_2/file.txt"; // делать константу public не стоит

    public static void main(String[] args) {
        String text = "Hello Alex! Have a nice day!\n";
        final int numIterations = 1000; // final здесь не ошибка, но необходимости в нем нету. 

        try (FileWriter fw = new FileWriter(OUTPUT_FILE)) {
            for (int i = 0; i < numIterations; ++i) {
                fw.write(text);
            }

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
