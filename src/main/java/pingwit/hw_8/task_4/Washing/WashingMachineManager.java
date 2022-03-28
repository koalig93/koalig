package pingwit.hw_8.task_4.Washing;

public class WashingMachineManager {
    private final WashingMachine wm;

    public WashingMachineManager() {
        this.wm = new WashingMachine();
    }

    public void turnOn() {
        wm.turnOnThePower();
    }

    public void turnOff() {
        try {
            wm.turnOffThePower();
        } catch (PowerOffException e) {
            System.out.println("Failure: " + e.getMessage());
            wm.drainWater();
        }
    }

    public void start() {
        wm.start();
    }

    public void stop() {
        wm.stop();
    }
}
