package Robots;
import RobotBase.RobotBase;
import Base.FoodBase;

public class ChefBot extends RobotBase {
    public ChefBot(String name) {
        super(name);
    }

    public void preparingMeal(FoodBase dish) {
        dish.prepare();
    }
}
