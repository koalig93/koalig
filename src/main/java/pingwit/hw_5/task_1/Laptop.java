package pingwit.hw_5.task_1;

// +
public class Laptop implements Computer {

    private final String id;
    private final String model;
    private boolean on;

    public Laptop(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public void start() {
        on = true;
    }

    @Override
    public void shutDown() {
        on = false;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isOn() {
        return on;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
