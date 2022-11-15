package Dishes;
import Base.FoodBase;
public class Sandwich extends FoodBase {

    private static final int menuId = 3;
    private static final String name = "Philly Cheese Steak Sandwich";
    private static final double price = 7.50;

    public Sandwich(int quantity) {
        super(quantity);
    }

    @Override
    public void prepare() {
        processingBread();
        processingProtein();
        addingIngredients();
        System.out.println("Mhmmhmmm, this makes me want a sandwich!");
    }

    public void processingProtein() {
        System.out.println("Slicing and adding protein...");
    }

    public void processingBread() {
        System.out.println("Getting the bread....");
    }

    public void addingIngredients() {
        System.out.println("Adding requested toppings and condiments...");
    }

    public void gettingOrderReady() {
        System.out.println("Sub coming right up!");
    }

}
