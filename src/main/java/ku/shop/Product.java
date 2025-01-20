package ku.shop;

public class Product {
    private double price;
    private String name;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void cutStock(int quantity) throws Exception {
        if (stock < quantity){

            throw new Exception("There's not enough products in stock.");
        }
        else {
            stock -= quantity;
        }
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() throws Exception {
        if (stock < 0) {
            throw new Exception("There's not enough products in stock.");
        }
        return stock;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
