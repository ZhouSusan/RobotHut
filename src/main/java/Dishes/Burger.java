package Dishes;
import Base.FoodBase;

public class Burger extends FoodBase {
    private static final int menuId = 1;
    private static final String name = "Burger";
    private static final double price = 10.99;

    public Burger(int quantity) {
        super(quantity);
        this._name = name;
        this._price = price;
        this._menuId = menuId;
    }


}
