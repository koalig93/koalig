package pingwit.hw_9.task_6;

import java.io.FileWriter;
import java.io.IOException;

public class WriteSecretNumberMain {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(Path.IMAGE.toString(), true)) {
            String mySecretMessage = "My secret message";
            fw.append("\nSecret:" + mySecretMessage);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
