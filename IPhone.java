package cel;

public class IPhone extends Producto {
    private String model;
    public IPhone(String productName, double price, String model) {
        super(productName, price);
        this.model = model;
    }
}
