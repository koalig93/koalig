package pingwit.hw_9.task_6;

import java.io.FileWriter;
import java.io.IOException;

// еще можно было запомнить с какого байта началась запись твоей фразы в файл и затем начать читать с этого момента
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
