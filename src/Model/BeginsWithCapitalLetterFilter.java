package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class BeginsWithCapitalLetterFilter extends AbstractFilter {

    @Override
    protected Product checkProduct(Product product) {
        String stringToCheck = product.getName();
        if (Character.isUpperCase(stringToCheck.charAt(0))) {
            System.out.println("The product name begins with an uppercase letter.");
        } else {
            Character charToReplace = stringToCheck.charAt(0);
            System.out.println("The product does not have an uppercase in the beginning. Made modification");
            String newName = stringToCheck.replace(charToReplace, Character.toUpperCase(charToReplace));
            product.withName(newName);
        }
        return product;
    }
}
