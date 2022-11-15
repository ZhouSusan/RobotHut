package Dishes;
import Base.FoodBase;
public class Sandwich extends FoodBase {

    private static final int menuId = 3;
    private static final String name = "Philly Cheese Steak Sandwich";
    private static final double price = 7.50;

    public Sandwich(int quantity) {
        super(quantity);
    }

}
