package lab2;

import java.time.LocalDateTime;

public class Car {
    static String brand;
    int productionYear;
    LocalDateTime creationDate;

    Car(String brand) {
        this.brand = brand;
        this.creationDate = LocalDateTime.now();
    }


    String getBrand() {
        return brand;
    }




}
