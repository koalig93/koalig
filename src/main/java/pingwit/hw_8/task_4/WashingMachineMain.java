package pingwit.hw_8.task_4;

import pingwit.hw_8.task_4.Washing.WashingMachineManager; // Washing - название пакета с маленькой буквы

public class WashingMachineMain {
    public static void main(String[] args) {
        WashingMachineManager wmm = new WashingMachineManager();

        wmm.turnOn();
        wmm.start();
        wmm.stop();
        wmm.turnOff();

        wmm.start();

        wmm.turnOn();
        wmm.start();
        wmm.turnOff();
    }
}
