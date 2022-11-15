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

    public void setMenuId(int menuId) {
        this._menuId = menuId;
    }

    public int getMenuId() {
        return this._menuId;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getName() {
        return this._name;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public double getPrice() {
        return this._price;
    }

    public void setQuantity(int quantity) {
        this._quantity = quantity;
    }

    public int getQuantity() {
        return this._quantity;
    }

    public double getTotal() {
        return 0.0;
    }
    
}
