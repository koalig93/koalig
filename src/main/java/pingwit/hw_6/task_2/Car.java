package pingwit.hw_6.task_2;

abstract class Car {

    private static final int GEAR_LENGTH = 20;

    private Engine engine = new Engine();
    private Transmission transmission = new Transmission();
    private boolean accelerate = false;

    private final String model; // final поля идут выше обычных

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void start() {
        if (transmission.getGear() > 0) {
            System.out.println("Please move transmission to neutral state before starting");
        } else {
            engine.startEngine();
        }
    }

    public void stop() {
        engine.stopEngine();
        accelerate = false;
    }

    public void increaseGear() {
        transmission.increaseGear();
        if (accelerate) {
            showSpeed();
        }
    }

    public void decreaseGear() {
        transmission.decreaseGear();
        if (accelerate) {
            showSpeed();
        }
    }

    public void switchTransmissionToNeutralState() {
        transmission.setNeutralState();
        if (accelerate) {
            showSpeed();
        }
    }

    public void pushAcceleration() {
        if (!engine.isStarted()) {
            System.out.println("To start movement start engine");
        } else {
            accelerate = true;
            showSpeed();
        }
    }

    public void pullAcceleration() {
        accelerate = false;
    }

    public int getSpeed() {
        if (accelerate) {
            return GEAR_LENGTH * transmission.getGear();
        }
        return 0;
    }

    public void showSpeed() {
        System.out.println("Current speed: " + getSpeed());
    }

    @Override
    public String toString() {
        return model +
                "{engine=" + engine +
                ", transmission=" + transmission +
                ", accelerate=" + accelerate +
                '}';
    }
}
