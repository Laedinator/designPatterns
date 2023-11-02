package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * Defines the product
 **/
public class Product {
    private long productId;
    private String Name;
    private int price;
    private String category;
    private boolean bulkOrders;

    public Product(long productId, String name, int price, String category, boolean bulkOrders) {
        this.productId = productId;
        Name = name;
        this.price = price;
        this.category = category;
        this.bulkOrders = bulkOrders;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isBulkOrders() {
        return bulkOrders;
    }

    public void setBulkOrders(boolean bulkOrders) {
        this.bulkOrders = bulkOrders;
    }
}
