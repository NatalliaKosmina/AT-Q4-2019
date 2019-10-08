public class Merchandise {
    private String type;
    private String name;
    private double price;
    private int quantity;

    public Merchandise(String type, String name, int quantity, double price) {
        this.type = type;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double merchPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Merchandise{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
