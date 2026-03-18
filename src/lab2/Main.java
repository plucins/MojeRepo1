package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        bmw.productionYear = 2018;


        Car fiat = new Car("Fiat");
        fiat.productionYear = 2020;

        List<Car> cars = Arrays.asList(bmw, fiat);

        for(Car car : cars) {
            System.out.println(car.creationDate + " " + car.getBrand() + " " + car.productionYear);
        }

        int[] intTab = {1,2,7,1};

        ArrayOperations arrayOperations = new ArrayOperations();
        ArrayOperations.printArray(intTab);




    }
}
