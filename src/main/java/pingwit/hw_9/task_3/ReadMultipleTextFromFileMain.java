package pingwit.hw_9.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import pingwit.hw_9.task_2.WriteMultipleTextToFileMain;

public class ReadMultipleTextFromFileMain {

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(WriteMultipleTextToFileMain.OUTPUT_FILE);
                BufferedReader br = new BufferedReader(fr)) {

            char[] buff = new char[1024];
            int n;
            while ((n = br.read(buff)) != -1) {
                if (n < buff.length) {
                    System.out.println(Arrays.copyOf(buff, n));
                } else {
                    System.out.print(buff);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
