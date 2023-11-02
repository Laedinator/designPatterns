package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class SellProduct implements Order {
    private final Product product;

    public SellProduct(Product product) {
        this.product = product;
    }

    public void executeOrder() {
        product.decreaseAmount();
    }
}
