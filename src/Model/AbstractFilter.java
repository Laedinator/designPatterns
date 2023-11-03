package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public abstract class AbstractFilter {

    protected AbstractFilter nextFilter;

    public void setNextFilter(AbstractFilter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public Product checkFilter(Product product) {
        checkProduct(product);
        if (nextFilter != null) {
            nextFilter.checkFilter(product);
        }
        return product;
    }

    protected abstract Product checkProduct(Product product);

}
