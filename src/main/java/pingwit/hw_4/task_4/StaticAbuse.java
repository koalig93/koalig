package pingwit.hw_4.task_4;

import pingwit.hw_4.task_1.Person;

// +
public class StaticAbuse {
    public static void main(String[] args) {
        Person newBorn = new Person();
        Person alex = new Person("Alex", 28);

        alex.setText("Потому что static");

        newBorn.showText();
        alex.showText();
    }
}
