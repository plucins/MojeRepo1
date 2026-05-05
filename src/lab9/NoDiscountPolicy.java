package lab9;

public class NoDiscountPolicy implements DiscountPolicy {

    @Override
    public double applyDiscount(double price) {
        return  price;
    }
}
