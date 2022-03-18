package pingwit.hw_5.task_3;

public class CountryHouse extends House {

    private static final int RENT_COEFF = 25; // для демо варианта ок, но я думаю такой коеффициент на стоит делать одинаковым для всех объектов

    public CountryHouse(Integer numFloors, Integer numTenants) {
        super(numFloors, numTenants);
    }

    @Override
    public Integer getRentPayment() {
        return RENT_COEFF * getNumFloors() * getNumTenants();
    }

    @Override
    public String toString() {
        return "CountryHouse{" + super.toString() + "}";
    }
}
