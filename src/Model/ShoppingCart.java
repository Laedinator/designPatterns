package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * Handles the shopping cart as singleton.
 **/
public class ShoppingCart {

    private static ShoppingCart shoppingCart;

    private final List<Product> shoppingList = new ArrayList<>();


    //constructor
    private ShoppingCart() {
    }

    public static ShoppingCart getInstance() {
        if (shoppingCart == null) {
            shoppingCart = new ShoppingCart();
        }
        return shoppingCart;
    }

    public void addProduct(Product product) {
        shoppingList.add(product);
    }

    public List<Product> getProducts() {
        return shoppingList;
    }

}
