package pingwit.hw_6.task_3.monkeys;

import pingwit.hw_6.task_3.garden.Branch;

public class MonkeyManager {

    public static void askMonkeyToCountFruits(Monkey monkey, Branch branch) {
        System.out.println(monkey + " says that number of fruits on " + branch + " is " + monkey.countFruits(branch));
    }
}
