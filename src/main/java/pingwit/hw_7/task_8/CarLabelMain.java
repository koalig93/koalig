package pingwit.hw_7.task_8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

public class CarLabelMain {

    private static final Map<String, String> REPLACEMENT_RULE = new HashMap<>() {{
        put("1.4", "2.0T");
        put("1.8", "1.8T");
    }};

    public static void main(String[] args) {

        Car[] cars = {
                new Car(),
                new Car("Skoda Octavia", UUID.randomUUID() + ", 1.8"),
                new Car("Mazda 3", "1.4, " + UUID.randomUUID() + "1.4"),
                new Car("Tesla", "electric"),
                new Car("BMW", UUID.randomUUID() + ", 1.4 - X6"),
                new Car("Skoda Superb", UUID.randomUUID() + "2.4T"),
                new Car()
        };

        System.out.println("Original cars :");
        for (Car car : cars) {
            System.out.println(car);
        }

        fixEngineLabels(cars);

        System.out.println("Fixed cars :");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static void fixEngineLabels(Car[] cars) {
        for (Car car : cars) {
            String engineLabel = car.getEngineLabel();

            for (Entry<String, String> entry : REPLACEMENT_RULE.entrySet()) {
                engineLabel = engineLabel.replaceAll(entry.getKey(), entry.getValue());
            }
            car.setEngineLabel(engineLabel);
        }
    }
}