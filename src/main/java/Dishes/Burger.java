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

    @Override
    public void prepare() {
       cookingMeat();
       processingBread();
       addingIngredients();
       gettingOrderReady();
       System.out.println("Order is ready to server. Enjoy!");
    }

    public void cookingMeat() {
        System.out.println("Cooking patties...");
    }

    public void processingBread() {
        System.out.println("Preparing the bread....");
    }

    public void addingIngredients() {
        System.out.println("Adding ingredients...");
    }

    public void gettingOrderReady() {
        System.out.println("Getting order ready");
    }
}
