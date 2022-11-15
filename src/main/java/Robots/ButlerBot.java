package Robots;
import RobotBase.RobotBase;
import org.example.Customer;
import org.example.CustomerOrder;

public class ButlerBot extends RobotBase {
    public ButlerBot(String name) {
        super(name);
    }

    public void takeOrders(CustomerOrder thisCustomerOrder) {
        System.out.format("Hi %s! \nWhat would you be having? \nBurger, Pizza, or Sandwich?", thisCustomerOrder.getCustomer().getName());
        System.out.format("\nOrder up!\n");
    }
}
