package lab4;

public enum PizzaType {
    MARGARITA("Klasyczna pizza z sosem", 0),
    PEPPERONI("Pizza peperoni", 5),
    VEGETARIAN("Pizza wegetariańska", 3);

    private final String description;
    private final double extraCost;

    PizzaType(String description, double extraCost) {
        this.description = description;
        this.extraCost = extraCost;
    }

    public String getDescription() {
        return description;
    }

    public double getExtraCost() {
        return extraCost;
    }
}
