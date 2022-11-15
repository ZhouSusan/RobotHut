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

    public void prepare() {

        processingDough();
        addingToppings();
        cookingPizza();
        gettingOrderReady();
        System.out.println("Hot Pizza! Enjoy!");
    }

    public void cookingPizza() {
        System.out.println("Putting Pizza in the oven...");
    }

    public void processingDough() {
        System.out.println("Preparing the dough....");
    }

    public void addingToppings() {
        System.out.println("Adding sauce and toppings to the pizza...");
    }

    public void gettingOrderReady() {
        System.out.println("Can you smell that pizza");
    }
}
