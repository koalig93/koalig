package pingwit.hw_6.task_3.garden;

// +
public class Tree extends FruitBranch {

    public Tree(FruitType fruitType) {
        super(fruitType, 0);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "fruitType=" + getFruitType() +
                '}';
    }
}
