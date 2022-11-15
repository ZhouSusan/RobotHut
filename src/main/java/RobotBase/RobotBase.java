package RobotBase;

import org.example.CustomerOrder;

public abstract class RobotBase {
    private String _name;

    public RobotBase(String name) {
        this._name = name;
    }

    public void prepare() {
        System.out.format("%s, ready for duty!", this._name);
    };

    public void speak() {
        System.out.format("Hi my name is %s. Welcome to Robot Hut. How may I help you?", this._name);
    };
}
