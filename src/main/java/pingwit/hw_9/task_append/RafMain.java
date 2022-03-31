package pingwit.hw_9.task_append;

import java.io.RandomAccessFile;

public class RafMain {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("src/main/java/pingwit/hw_9/task_append/file.txt", "rw")) {

            String startMessage = "Eto vstatvim";
            raf.seek(5);
            raf.write(startMessage.getBytes());

        } catch (Exception e) {

        }
    }
}