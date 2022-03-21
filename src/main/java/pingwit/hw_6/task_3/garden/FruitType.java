package pingwit.hw_6.task_3.garden;

public enum FruitType {
    COCONUT("Coconut"),
    BANANA("Banana");

    private final String name;

    FruitType(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}