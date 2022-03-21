package pingwit.hw_6.task_3;

import java.util.concurrent.ThreadLocalRandom;
import pingwit.hw_6.task_3.garden.Branch;
import pingwit.hw_6.task_3.garden.FruitType;
import pingwit.hw_6.task_3.garden.FruitBranch;
import pingwit.hw_6.task_3.garden.Tree;
import pingwit.hw_6.task_3.monkeys.Monkey;
import pingwit.hw_6.task_3.monkeys.MonkeyManager;
import pingwit.hw_6.task_3.monkeys.SmartMonkey;
import pingwit.hw_6.task_3.monkeys.StupidMonkey;

public class TreesAndMonkeysMain {
    public static void main(String[] args) {
        Branch coconutTree = new Tree(FruitType.COCONUT);
        waterBranch(coconutTree, 1, 5);

        Branch bananaTree = new Tree(FruitType.BANANA);
        waterBranch(bananaTree, 2, 5);

        coconutTree.showFruits();
        bananaTree.showFruits();

        Monkey coconutMonkey = new StupidMonkey(FruitType.COCONUT);
        coconutMonkey.sayHi();
        Monkey bananaMonkey = new StupidMonkey(FruitType.BANANA);
        bananaMonkey.sayHi();
        Monkey smartMonkey = new SmartMonkey();
        smartMonkey.sayHi();

        MonkeyManager.askMonkeyToCountFruits(coconutMonkey, coconutTree);
        MonkeyManager.askMonkeyToCountFruits(coconutMonkey, bananaTree);

        MonkeyManager.askMonkeyToCountFruits(bananaMonkey, coconutTree);
        MonkeyManager.askMonkeyToCountFruits(bananaMonkey, bananaTree);

        MonkeyManager.askMonkeyToCountFruits(smartMonkey, coconutTree);
        MonkeyManager.askMonkeyToCountFruits(smartMonkey, bananaTree);
    }

    private static void waterBranch(Branch root, int depth, int branchLimit) {
        if (depth > 0) {
            int numBranches = ThreadLocalRandom.current().nextInt(1, branchLimit);
            for (int i = 0; i < numBranches; ++i) {
                Branch branch = new FruitBranch(root.getFruitType());
                waterBranch(branch, depth - 1, branchLimit);
                root.addBranch(branch);
            }
        }
    }
}
