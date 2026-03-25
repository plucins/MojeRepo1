package lab4;

public enum DayOfWeek {
    MONDAY(0.1),
    TUESDAY(0.0),
    WEDNESDAY(0.15),
    THURSDAY(0.1),
    FRIDAY(0),
    SATURDAY(0.2),
    SUNDAY(0.3);

    private final double discount;

    DayOfWeek(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
