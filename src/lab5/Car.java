package lab5;


public class Car extends Vehicle {
    private String fuelType;
    private int engineCapacity;

    public Car(String brand, int prodYear,  String fuelType, int engineCapacity) {
        super(brand, prodYear);
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    public void drive() {
        System.out.println(brand + " drives on the road, has (" + fuelType + " " + engineCapacity + ")");
    }
}
