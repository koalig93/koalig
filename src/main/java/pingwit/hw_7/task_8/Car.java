package pingwit.hw_7.task_8;

import java.util.Objects;

public class Car {
    private final String model;
    private String engineLabel;

    public Car() {
        this("Unknown car", "Unknown engine");
    }

    public Car(String model, String engineLabel) {
        this.model = model;
        this.engineLabel = engineLabel;
    }

    public String getEngineLabel() {
        return engineLabel;
    }

    public void setEngineLabel(String engineLabel) {
        this.engineLabel = engineLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return model.equals(car.model) &&
                engineLabel.equals(car.engineLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, engineLabel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineLabel='" + engineLabel + '\'' +
                '}';
    }
}
