package lab4;

import java.util.Scanner;

public class PizzaApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== System zamówień ==");
        System.out.println("Wybierz rozmiar pizzy");
        for(PizzaSize size: PizzaSize.values()){
            System.out.println(size.ordinal() + ". " + size);
        }
        PizzaSize pizzaSize = PizzaSize.values()[input.nextInt()];

        System.out.println("Wybierz typ pizzy");
        for(PizzaType pizzaType: PizzaType.values()){
            System.out.println(pizzaType.ordinal() + ". " + pizzaType);
        }

        PizzaType pizzaType = PizzaType.values()[input.nextInt()];

        System.out.println("Podaj dzień tygodnia");
        DayOfWeek day = DayOfWeek.valueOf(input.next().toUpperCase());


        Order order = new Order(pizzaSize, pizzaType, day);
        order.printOrderSummary();

    }
}
