package pingwit.hw_5.task_3;

public class ApartmentHouse extends House {

    private static final int RENT_COEFF = 20;

    public ApartmentHouse(Integer numFloors, Integer numTenants) {
        super(numFloors, numTenants);
    }

    @Override
    public Integer getRentPayment() {
        return RENT_COEFF * getNumTenants();
    }

    @Override
    public String toString() {
        return "ApartmentHouse{" + super.toString() +"}";
    }
}
