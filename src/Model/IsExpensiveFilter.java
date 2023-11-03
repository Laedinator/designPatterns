package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class IsExpensiveFilter extends AbstractFilter {


    @Override
    protected Product checkProduct(Product product) {
        if (product.getPrice() > 100.0) {
            System.out.println("This is an expensive Product.");
        } else {
            System.out.println("This is a cheap Product.");
        }

        return product;
    }
}
