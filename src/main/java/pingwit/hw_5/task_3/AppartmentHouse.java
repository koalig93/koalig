package pingwit.hw_5.task_3;

public class AppartmentHouse extends House {

    private static final int RENT_COEFF = 20;

    public AppartmentHouse(Integer numFloors, Integer numTenants) {
        super(numFloors, numTenants);
    }

    @Override
    public Integer getRentPayment() {
        return RENT_COEFF * getNumTenants();
    }

    @Override
    public String toString() {
        return "AppartmentHouse{" + super.toString() +"}";
    }
}
