import org.w3c.dom.ls.LSOutput;

public class Pizza {
    private Integer price;
    private Boolean veg;

    private final int vegPizzaPrice = 300;
    private final int nonVegPizzaPrice = 500;

    private final int extraCheesePrice = 100;
    private boolean extraCheeseAdded = false;
    private final int extraTopingsPrice = 50;
    private boolean extraTopingsAdded = false;
    public final int takeOutPrice = 25;
    public boolean takeOutSetted = false;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if (veg) {
            this.price = vegPizzaPrice;
        }
        else {
            this.price = nonVegPizzaPrice;
        }
    }
    public void addExtraCheese() {
        this.price += extraCheesePrice;
        extraCheeseAdded = true;
    }

    public void addExtraToppings() {
        this.price += extraTopingsPrice;
        extraTopingsAdded = true;
    }

    public void getTakeOut() {
        this.price += takeOutPrice;
        takeOutSetted = true;
    }

    public void getBill() {
        if (this.veg){
            System.out.println("Veg Pizza Chosen: " + vegPizzaPrice);
        } else {
            System.out.println("Non-veg Pizza Chosen: " + nonVegPizzaPrice);
        }
        if (extraCheeseAdded) System.out.println("Extra Cheese Added: " + extraCheesePrice);
        if (extraTopingsAdded) System.out.println("Extra Toppings Added: " + extraTopingsPrice);
        if (takeOutSetted) System.out.println("Take Out Price: " + takeOutPrice);
        System.out.println("Total Bill: " + this.price);

    }

}
