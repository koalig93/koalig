package pingwit.hw_9.task_4_5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmployeeMain {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(WriteEmployeeMain.FILE);
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            Employee alex = (Employee) ois.readObject();
            System.out.println(alex);

        } catch (IOException | ClassNotFoundException e) { // я бы заменил на catch (Exception e) или сделал два блока catch
            e.printStackTrace();
        }
    }
}
