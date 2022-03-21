package pingwit.hw_6.task_2;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Octavia();

        myCar.start();
        myCar.start();

        myCar.increaseGear();

        myCar.pushAcceleration();

        myCar.increaseGear();
        myCar.increaseGear();
        myCar.decreaseGear();
        myCar.decreaseGear();

        myCar.stop();
        myCar.stop();

        myCar.start();
        myCar.switchTransmissionToNeutralState();
        myCar.start();
        myCar.pushAcceleration();
        myCar.stop();
    }
}
