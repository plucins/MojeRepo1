package lab9;

public class Main {

    public static void main(String[] args) {
        Order order1 = new Order(50, new NoDiscountPolicy());

        System.out.println(order1.calculateFinalPrice());

        Order order2 = new Order(100, new PercentageDiscount(0.3));

        System.out.println(order2.calculateFinalPrice());

        Order order3 = new Order(330, new ThresholdDiscount(30,300));

        System.out.println(order3.calculateFinalPrice());

    }
}
