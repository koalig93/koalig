package pingwit.hw_5.task_1;

public class Laptop implements Computer {

    private String id;
    private String model;

    public Laptop(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void restart() {
        System.out.println("Restart");
    }

    @Override
    public void shutDown() {
        System.out.println("Shut down");
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
