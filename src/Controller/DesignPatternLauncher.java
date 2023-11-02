package Controller;

import Model.Product;
import Model.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class DesignPatternLauncher {
    public static void main(String[] args) {
        System.out.println("Launching DesignPattern webshop.\n");
        System.out.println("Product List with builder constructors.");
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product().withName("Football").withDescription("A round football")
                .withCategory("Sports").withPrice(19.99).withBulkorders(true);
        Product product2 = new Product().withName("Basketball").withDescription("A round basketball")
                .withCategory("Sports").withPrice(19.99).withBulkorders(true);
        Product product3 = new Product().withName("Football").withDescription("A round football with red dots")
                .withCategory("Sports").withPrice(19.99).withBulkorders(true);
        products.add(product1);
        products.add(product2);
        products.add(product3);

        for (Product product : products) {
            System.out.println(product.toString());
        }

        System.out.println("\nWorking with singleton ShoppingCart");
        ShoppingCart shoppingCart = ShoppingCart.getInstance();
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);

        List<Product> shoppingList = shoppingCart.getProducts();
        for (Product product : shoppingList) {
            System.out.println(product);
        }

    }
}
