package lab9;

public class ThresholdDiscount implements DiscountPolicy {
    private double discount;
    private double threshold;

    public ThresholdDiscount(double discount, double threshold) {
        this.discount = discount;
        this.threshold = threshold;
    }

    @Override
    public double applyDiscount(double price) {
        if (price > threshold) {
            return price - discount;
        }

        return price;
    }
}
