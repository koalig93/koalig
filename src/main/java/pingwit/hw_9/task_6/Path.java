package pingwit.hw_9.task_6;

// внезапно enum в hw_9 :)
// потренироваться конечно можно, но вообще енам использовать для хранения пути к файлу вряд ли хорошая идея, т.к. он часто может меняться
public enum Path {
    IMAGE("src/main/java/pingwit/hw_9/task_6/shrek.png");

    String path; // private String path

    Path(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return path;
    }
}
