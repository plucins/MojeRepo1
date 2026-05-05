package lab9;

public class Order {
    private double totalPrice;
    private DiscountPolicy discountPolicy;

    public Order(double totalPrice, DiscountPolicy discountPolicy) {
        this.totalPrice = totalPrice;
        this.discountPolicy = discountPolicy;
    }

    public double calculateFinalPrice(){
        return discountPolicy.applyDiscount(totalPrice);
    }
}
