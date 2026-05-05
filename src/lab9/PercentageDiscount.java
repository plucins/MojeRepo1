package lab9;

public class PercentageDiscount implements DiscountPolicy {

    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price * (1 - percentage);
    }
}
