package lab5;

public class Vehicle {
    protected String brand;
    private int prodYear;

    public Vehicle(String brand, int prodYear) {
        this.brand = brand;
        this.prodYear = prodYear;
    }

    public void drive() {
        System.out.println(brand + " is driving...");
    }

    @Override
    public String toString() {
        return brand + " ("  + prodYear + ")";
    }

}
