package pingwit.hw_5.task_2;

import java.util.Arrays;
import java.util.UUID;
import pingwit.hw_5.task_1.Computer;
import pingwit.hw_5.task_1.Laptop;

public class WarehouseMain {

    public static void main(String[] args) {
        Computer[] myComputers = {new Laptop(UUID.randomUUID().toString(), "MSI"),
                new Laptop(UUID.randomUUID().toString(), "MacBook")};
        Warehouse<Computer> warehouse = new Warehouse<>(myComputers);

        System.out.println(Arrays.toString(warehouse.getArray()));
        System.out.println(warehouse);

        for (int i = 0; i < 3; ++i) {
            Computer comp = warehouse.next();
            comp.start();
            comp.restart();
            comp.shutDown();

            System.out.println(comp);
        }
    }
}
