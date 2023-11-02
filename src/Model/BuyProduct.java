package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class BuyProduct implements Order {
    private final Product product;

    public BuyProduct(Product product) {
        this.product = product;
    }

    public void executeOrder() {
        product.addAmount();
    }
}
