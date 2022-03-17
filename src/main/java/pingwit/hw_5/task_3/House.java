package pingwit.hw_5.task_3;

public abstract class House {

    private final Integer numFloors;
    private final Integer numTenants;
    private Boolean isWarmingOn;

    public House(Integer numFloors, Integer numTenants) {
        this.numFloors = numFloors;
        this.numTenants = numTenants;
        this.isWarmingOn = false;
    }

    public void turnWarmingOn() {
        isWarmingOn = true;
    }

    public Integer getNumFloors() {
        return numFloors;
    }

    public Integer getNumTenants() {
        return numTenants;
    }

    abstract Integer getRentPayment();

    @Override
    public String toString() {
        return "number of floors = " + numFloors +
                ", number of tenants = " + numTenants +
                ", warming = " + (isWarmingOn ? "on" : "off");
    }
}
