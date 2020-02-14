package product.object;

public class Product {
    public String name;
    public String oldPrice;
    public String newPrice;

    public Product(String name, String oldPrice, String newPrice)
    {
        this.name = name;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }

    public String getName() {
        return name;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public String getNewPrice() {
        return newPrice;
    }
}
