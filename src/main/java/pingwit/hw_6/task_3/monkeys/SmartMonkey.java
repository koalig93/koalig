package pingwit.hw_6.task_3.monkeys;

import pingwit.hw_6.task_3.garden.Branch;

public class SmartMonkey implements Monkey {

    @Override
    public int countFruits(Branch branch) {
        int result = branch.getNumFruits();

        for (Branch child : branch.getBranches()) {
            result += countFruits(child);
        }
        return result;
    }

    @Override
    public void sayHi() {
        System.out.println("I'm a smart monkey. I can count any fruits");
    }

    @Override
    public String toString() {
        return "SmartMonkey";
    }
}
