package pingwit.hw_9.task_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadSecretMessageMain {
    public static void main(String[] args) {
        try (FileReader fis = new FileReader(Path.IMAGE.toString());
                BufferedReader br = new BufferedReader(fis)) {
            String detectString = "Secret:";
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(detectString)) {
                    System.out.println(line.substring(detectString.length()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
