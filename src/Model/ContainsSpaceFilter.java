package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class ContainsSpaceFilter extends AbstractFilter {

    @Override
    protected Product checkProduct(Product product) {
        String nameToCheck = product.getName();
        if (nameToCheck.contains(" ")) {
            System.out.println("The product name contains a space. Made modification");
            String nameToSave = nameToCheck.replace(" ", "");
            product.withName(nameToSave);
        } else {
            System.out.println("The product name does not contain a space.");
        }
        return product;
    }
}
