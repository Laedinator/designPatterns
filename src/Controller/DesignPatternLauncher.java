package Controller;

import Model.Product;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class DesignPatternLauncher {
    public static void main(String[] args) {
        System.out.println("Launching DesignPattern webshop.");

        Product product1 = new Product().withName("Football").withDescription("A round football").withCategory("Sports").withPrice(19.99).withBulkorders(true);
        Product product2 = new Product().withName("Basketball").withDescription("A round basketball").withCategory("Sports").withPrice(19.99).withBulkorders(true);
        Product product3 = new Product().withName("Football").withDescription("A round football with red dots").withCategory("Sports").withPrice(19.99).withBulkorders(true);
        System.out.println("Product one:\n" + product1.toString());
        System.out.println("Product one:\n" + product2.toString());
        System.out.println("Product one:\n" + product3.toString());

    }
}
