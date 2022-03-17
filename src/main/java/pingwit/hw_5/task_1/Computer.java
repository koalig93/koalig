package pingwit.hw_5.task_1;

public interface Computer {

    void start();
    void shutDown();

    default void restart() {
        System.out.println("Restart");
    }
}
