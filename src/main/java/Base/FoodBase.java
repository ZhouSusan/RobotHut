package Base;
import Base.FoodInterface;

public abstract class FoodBase implements FoodInterface {

    protected int _menuId;
    protected String _name;
    protected double _price;
    protected int _quantity;

    public FoodBase(int menuId, String name, double price, int quantity) {
        this._menuId = menuId;
        this._name = name;
        this._price = price;
        this._quantity = quantity;
    }

    
}
