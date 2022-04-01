package pingwit.hw_9.task_6;

// внезапно enum в hw_9 :)
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
