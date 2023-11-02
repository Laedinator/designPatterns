package Controller;

import Model.Product;
import Model.ProductFactory;
import Model.ShoppingCart;
import Model.Surfboard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class DesignPatternLauncher {
    public static void main(String[] args) {

        //region Builder
//        System.out.println("Launching DesignPattern webshop.\n");
//        System.out.println("Product List with builder constructors.");
//        ArrayList<Product> products = new ArrayList<>();
//        Product product1 = new Product().withName("Football").withDescription("A round football")
//                .withCategory("Sports").withPrice(19.99).withBulkorders(true);
//        Product product2 = new Product().withName("Basketball").withDescription("A round basketball")
//                .withCategory("Sports").withPrice(19.99).withBulkorders(true);
//        Product product3 = new Product().withName("Football").withDescription("A round football with red dots")
//                .withCategory("Sports").withPrice(19.99).withBulkorders(true);
//        products.add(product1);
//        products.add(product2);
//        products.add(product3);
//
//        for (Product product : products) {
//            System.out.println(product.toString());
//        }
//
//        System.out.println("\nWorking with singleton ShoppingCart");
//        ShoppingCart shoppingCart = ShoppingCart.getInstance();
//        shoppingCart.addProduct(product1);
//        shoppingCart.addProduct(product2);
//        shoppingCart.addProduct(product3);
//
//        List<Product> shoppingList = shoppingCart.getProducts();
//        for (Product product : shoppingList) {
//            System.out.println(product);
//        }
        //endregion

        //region ProductFactory
        ProductFactory productFactory = new ProductFactory();
        Product surfboardProduct = productFactory.createProduct("Surfboard");
        surfboardProduct.withDescription("A nice funboard").withName("O'laian").withPrice(399.99);
        //this has to happen because of compile  time. The Product has to be cast to the correct Object (Surfboard).
        Surfboard surfboard = (Surfboard) surfboardProduct;
        surfboard.setType("Egg");
        surfboard.setLength(9);
        System.out.println(surfboardProduct);
        Product bicycle = productFactory.createProduct("Bicycle");
        bicycle.withName("Stromer").withDescription("Fancy E-bike").withPrice(99999.9);
        System.out.println(bicycle);
        Product ball = productFactory.createProduct("Ball");
        ball.withPrice(9.99).withDescription("A fancy Football").withName("Nike");
        System.out.println(ball);
        Product skateboard = productFactory.createProduct("Skateboard");
        skateboard.withName("Fox").withDescription("Fancy Longboard").withPrice(299.9);
        System.out.println(skateboard);
        //endregion


    }
}
