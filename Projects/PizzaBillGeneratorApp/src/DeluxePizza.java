public class DeluxePizza extends Pizza{
    private Boolean veg;

    private int deluxeVegPizzaPrice = 450;
    private int deluxeNonVegPizzaPrice = 650;
    public DeluxePizza(Boolean veg) {
        super(veg);
        this.veg = veg;
        super.addExtraCheese();
        super.addExtraToppings();
    }

    public void getBill() {
        if (this.veg){
            System.out.println("Deluxe Veg Pizza Chosen: " + deluxeVegPizzaPrice);
        } else {
            System.out.println("Deluxe Non-veg Pizza Chosen: " + deluxeNonVegPizzaPrice);
        }
        if (super.takeOutSetted) {
            System.out.println("Additional Take out Charge: " + super.takeOutPrice);
            if (this.veg){
                System.out.println("Total Bill: " + (deluxeVegPizzaPrice + super.takeOutPrice));
            } else {
                System.out.println("Total Bill: " + (deluxeNonVegPizzaPrice + super.takeOutPrice));
            }
        }
        else {
            if (this.veg) {
                System.out.println("Total Bill: " + deluxeVegPizzaPrice);
            } else {
                System.out.println("Total Bill: " + deluxeNonVegPizzaPrice);
            }
        }

    }
}
