package lab5;

public class ElectricCar extends Car {
    private int batteryCapacity;


    public ElectricCar(String brand, int prodYear,  String fuelType, int engineCapacity, int batteryCapacity) {
        super(brand,prodYear,fuelType,engineCapacity);
        this.batteryCapacity = batteryCapacity;
    }

    public void drive(){
        System.out.println(brand + " drives silently.");
    }
}
