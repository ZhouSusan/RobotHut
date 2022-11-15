package Dishes;
import Base.FoodBase;

public class Pizza extends FoodBase{

    private static final int menuId = 2;
    private static final String name = "Pepperoni Pizza";
    private static final double price = 15.79;

    public Pizza(int quantity) {
        super(quantity);
        this._menuId = menuId;
        this._name = name;
        this._price = price;
    }
}
