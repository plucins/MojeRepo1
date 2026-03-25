package lab4;


public class Order {
    private PizzaSize size;
    private PizzaType type;
    private DayOfWeek dayOfWeek;

    public Order(PizzaSize size, PizzaType type, DayOfWeek dayOfWeek) {
        this.size = size;
        this.type = type;
        this.dayOfWeek = dayOfWeek;
    }

    private double calculatePrice(){
        double price = size.getBasePrise() + type.getExtraCost();
        return price * (1 - dayOfWeek.getDiscount());
    }

    public void printOrderSummary(){
        System.out.println("Podsumowanie zamówienia");
        System.out.println("Rozmiar: " + size);
        System.out.println("Typ: " + type.getDescription());
        System.out.println("Zamówiona dnia: " + dayOfWeek);
        System.out.println("Cena: " + calculatePrice());
    }
}
