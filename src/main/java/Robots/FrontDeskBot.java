package Robots;
import RobotBase.RobotBase;
import org.example.CustomerOrder;

public class FrontDeskBot extends RobotBase {
    public FrontDeskBot(String name) {
        super(name);
    }

    public void calculateBill(CustomerOrder thisCustomerOrder) {
        System.out.format("When you are ready, your total bill is %s. Thank you and come again!", thisCustomerOrder.getCustomerOrderTotal());
    }
}
