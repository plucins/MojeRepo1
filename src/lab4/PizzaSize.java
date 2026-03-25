package lab4;

public enum PizzaSize {
    SMALL(10),
    MEDIUM(20),
    LARGE(30),
    XLARGE(40);

    private final double basePrise;

    PizzaSize(double basePrise) {
        this.basePrise = basePrise;
    }

    public double getBasePrise() {
        return basePrise;
    }
}
