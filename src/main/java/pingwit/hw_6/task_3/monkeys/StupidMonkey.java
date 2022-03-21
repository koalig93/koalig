package pingwit.hw_6.task_3.monkeys;

import pingwit.hw_6.task_3.garden.Branch;
import pingwit.hw_6.task_3.garden.FruitType;

public class StupidMonkey implements Monkey {

    private final FruitType fruitType;

    public StupidMonkey(FruitType fruitType) {
        this.fruitType = fruitType;
    }

    @Override
    public int countFruits(Branch branch) {
        int result = 0;
        for (Branch child : branch.getBranches()) {
            result += countFruits(child);
        }

        if (fruitType.equals(branch.getFruitType())) {
            result += branch.getNumFruits();
        }
        return result;
    }

    @Override
    public void sayHi() {
        System.out.println("I'm a stupid monkey. I can count only " + fruitType + "s");
    }

    @Override
    public String toString() {
        return "StupidMonkey{" +
                "fruitType=" + fruitType +
                '}';
    }
}
