public class Main {
    public static void main(String[] args) {

        // Veg Pizza Ordering
//        Pizza p = new Pizza(true);
//        p.addExtraCheese();
//        p.getTakeOut();
//        p.getBill();

        // Non-veg Pizza Ordering
//        Pizza p = new Pizza(false);
//        p.addExtraCheese();
//        p.addExtraToppings();
//        p.getTakeOut();
//        p.getBill();

        // Deluxe pizza ordering, which automatically includes extra cheese and toppings

        DeluxePizza dp = new DeluxePizza(true);
        dp.getTakeOut();
        dp.getBill();

        System.out.println();

        DeluxePizza dp2 = new DeluxePizza(false);
        dp2.getBill();

    }
}