package lab5;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int prodYear, boolean hasSidecar) {
        super(brand, prodYear);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void drive() {
        String desc = hasSidecar ? "with a sidecar": "on two wheels";
        System.out.println(brand + " rides " + desc);
    }
}
