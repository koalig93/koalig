package pingwit.hw_8.task_4.Washing;

public class WashingMachine {
    boolean power = false;
    boolean running = false;

    WashingMachine() {
    }

    public void turnOnThePower() {
        power = true;
        System.out.println("The power is on");
    }

    public void turnOffThePower() throws PowerOffException {
        power = false;
        if (running) {
            running = false;
            throw new PowerOffException();
        }
        System.out.println("The power is off");

    }

    public void start() {
        if (power) {
            running = true;
            System.out.println("Started washing");
        } else {
            System.out.println("Cannot start washing without power");
        }
    }

    public void stop() {
        running = false;
        if (power) {
            System.out.println("Stopped washing");
        }
    }

    public void drainWater() {
        System.out.println("Water is drained");
    }
}
