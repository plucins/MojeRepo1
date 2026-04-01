package lab5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Vehicle m = new Motorcycle("Harley", 1999, false);
        Vehicle c = new Car("Toyota", 2020, "Diesel", 1998);
        Vehicle ec = new ElectricCar("Tesla", 2018, "Electric", 1600, 60);
        Vehicle v = new Vehicle("Woom", 2025);

        Vehicle[] fleet = { m, c, ec, v };

//        for(Vehicle v1 : fleet){
//            v1.drive();
//        }

        for(Vehicle v2 : fleet){
            if(v2 instanceof Car){
                v2.drive();
            }
        }

    }
}
