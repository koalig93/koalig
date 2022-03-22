package pingwit.hw_6.task_2;

public class Engine {

    private boolean state = false; // по умолчанию будет false, но указать явно не будет ошибкой

    public boolean isStarted() {
        return state;
    }

    public void startEngine() {
        if (state) {
            System.out.println("Engine is already started");
        } else {
            System.out.println("Started");
            state = true;
        }
    }

    public void stopEngine() {
        if (!state) {
            System.out.println("Engine is already stopped");
        } else {
            System.out.println("Stopped");
            state = false;
        }
    }
}
