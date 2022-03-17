package pingwit.hw_5.task_3;

import pingwit.hw_5.task_2.Warehouse;

public class HouseMain {
    public static void main(String[] args) {
        House[] houses = {new CountryHouse(3, 10),
                new CountryHouse(2, 6),
                new AppartmentHouse(4, 48),
                new AppartmentHouse(5, 90)
        };

        Warehouse<House> houseCatalog = new Warehouse(houses);

        for (int i = 0; i < houseCatalog.size(); ++i) {
            House house = houseCatalog.next();
            house.turnWarmingOn();
            System.out.println(house + " : " + house.getRentPayment() + " USD per day");
        }
    }
}
