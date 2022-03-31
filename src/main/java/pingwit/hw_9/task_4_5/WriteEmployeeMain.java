package pingwit.hw_9.task_4_5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmployeeMain {

    public static final String FILE = "src/main/java/pingwit/hw_9/task_4_5/employee.txt";

    public static void main(String[] args) {
        Work work = new Work("developer", 8);
        Employee alex = new Employee("Alex", 28, work);

        System.out.println(alex);

        try (FileOutputStream fos = new FileOutputStream(FILE);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(alex);

            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
