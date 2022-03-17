package pingwit.hw_5.task_3;

public abstract class House {

    private Integer numFloors;
    private Integer numTenants;
    private Boolean isWarmingOn;

    public House(Integer numFloors, Integer numTenants) {
        this.numFloors = numFloors;
        this.numTenants = numTenants;
        this.isWarmingOn = false;
    }

    public House(Integer numFloors) {
        this(numFloors, 0);
    }

    public void turnWarmingOn() {
        isWarmingOn = true;
    }

    public void turnWarmingOff() {
        isWarmingOn = false;
    }

    public Boolean isWarmingOn() {
        return isWarmingOn;
    }

    public Integer getNumFloors() {
        return numFloors;
    }

    public Integer getNumTenants() {
        return numTenants;
    }

    public void setNumTenants(Integer numTenants) {
        this.numTenants = numTenants;
    }

    abstract Integer getRentPayment();

    @Override
    public String toString() {
        return "number of floors = " + numFloors +
                ", number of tenants = " + numTenants +
                ", warming = " + (isWarmingOn ? "on" : "off");
    }
}
