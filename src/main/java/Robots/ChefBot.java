package Robots;
import RobotBase.RobotBase;
import org.example.Customer;

public class ChefBot extends RobotBase {
    public ChefBot(String name) {
        super(name);
    }

    public void prepare() {
        System.out.format("Making %s now");
    }
}
