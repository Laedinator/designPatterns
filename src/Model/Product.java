package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * Defines the product
 **/
public class Product {
    private static int productAmount = 0;
    private int productId = 0;
    private String name = "";
    private String description = "";
    private double price = 0;
    private String category = "";
    private boolean bulkOrders = false;

    public Product() {
        productAmount++;
        this.productId += productAmount;
    }

    public Product withName(String name) {
        this.name = name;
        return this;
    }

    public Product withDescription(String description) {
        this.description = description;
        return this;
    }

    public Product withPrice(double price) {
        this.price = price;
        return this;
    }

    public Product withCategory(String category) {
        this.category = category;
        return this;
    }

    public Product withBulkorders(boolean bulkOrders) {
        this.bulkOrders = bulkOrders;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isBulkOrders() {
        return bulkOrders;
    }


    @Override
    public String toString() {
        return String.format("id: %d, name: %s, description %s, price: %s, category: %s, bulkOrders: %s",
                this.productId, this.name, this.description, this.price, this.category, this.bulkOrders);
    }
}
