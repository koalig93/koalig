package pingwit.hw_6.task_2;

// +
public class Transmission {

    private static final int MAX_GEAR = 7;
    private static final int MIN_GEAR = 0;

    private int gear = 0;

    public int getGear() {
        return gear;
    }

    public void increaseGear() {
        if (gear < MAX_GEAR) {
            gear++;
        }
    }

    public void decreaseGear() {
        if (gear > MIN_GEAR) {
            gear--;
        }
    }

    public void setNeutralState() {
        gear = MIN_GEAR;
    }
}
