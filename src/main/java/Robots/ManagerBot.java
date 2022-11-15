package Robots;
import Base.FoodBase;
import org.example.CustomerOrder;


public class ManagerBot {
    private ChefBot _cook;
    private FrontDeskBot _frontDesk;
    private ButlerBot _butler;

    public ManagerBot(ChefBot cook, FrontDeskBot frontDesk, ButlerBot butler) {
        this._cook = cook;
        this._frontDesk = frontDesk;
        this._butler = butler;
    }

    public void orderChefToCook(FoodBase dish) {
        System.out.format("%s cook!\n", _cook.get_name());
        _cook.preparingMeal(dish);
    }

    public void orderFrontDeskGreetCustomer() {
        System.out.format("%s, go greet the customers upfront!\n", _frontDesk.get_name());
        _frontDesk.speak();
    }

    public void orderButlerToTakeOrder(CustomerOrder co) {
        System.out.format("%s, customers are ready to take orders!\n", _butler.get_name());
        _butler.takeOrders(co);
    }

    public void orderFrontDeskToGetCheck(CustomerOrder co) {
        System.out.format("Customer, %s, is asking for the check.\n", co.getCustomer().getName());
        _frontDesk.calculateBill(co);
    }

}
