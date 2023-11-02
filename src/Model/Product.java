package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * Defines the product
 **/

public abstract class Product {
    private static int productAmount = 0;
    private int productId = 0;
    private String name = "";
    private String description = "";
    private double price = 0;
    private boolean bulkOrders = false;

    public Product() {
        productAmount++;
        this.productId += productAmount;
    }

    //region Builder with functions
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

    public Product withBulkorders(boolean bulkOrders) {
        this.bulkOrders = bulkOrders;
        return this;
    }
    //endregion

    //region Getters
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

    public boolean isBulkOrders() {
        return bulkOrders;
    }


    public abstract String getType();


    //endregion

    @Override
    public String toString() {
        return String.format("id: %d, name: %s, description %s, price: %s, type: %s, bulkOrders: %s",
                this.productId, this.name, this.description, this.price, this.getType(), this.bulkOrders);
    }

}
