package pingwit.hw_9.task_7;

import java.io.File;

// +
public class ExplorerMain {
    public static void main(String[] args) {
        File file = new File("src");

        exploreFileSystem(file, "");
    }

    private static void exploreFileSystem(File file, String indent) {
        System.out.println(indent + file.getName());

        if (file.isDirectory()) {
            indent += "  ";
            for (File child : file.listFiles()) {
                exploreFileSystem(child, indent);
            }
        }
    }
}
