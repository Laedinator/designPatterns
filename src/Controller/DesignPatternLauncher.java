package Controller;

import Model.*;

import java.util.ArrayList;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class DesignPatternLauncher {
    public static void main(String[] args) {

        System.out.println("Launching DesignPattern webshop.\n");
        //region Builder
        System.out.println("Creating a Product List with builder constructors.\n");
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Ball().withName("Football ").withDescription("A round football")
                .withPrice(19.99).withBulkorders(true);
        Product product2 = new Surfboard().withName("surfboard").withDescription("A small funboard")
                .withPrice(199.99).withBulkorders(false);
        Product product3 = new Ball().withName("Football").withDescription("A round football with red dots")
                .withPrice(29.99).withBulkorders(true);
        products.add(product1);
        products.add(product2);
        products.add(product3);

//        for (Product product : products) {
//            System.out.println(product.toString());
//        }

//        System.out.println("\nWorking with singleton ShoppingCart");
//        ShoppingCart shoppingCart = ShoppingCart.getInstance();
//        shoppingCart.addProduct(product1);
//        shoppingCart.addProduct(product2);
//        shoppingCart.addProduct(product3);
//
//        List<Product> shoppingList = shoppingCart.getProducts();
        //generic iterator
//        for (Product product : shoppingList) {
//            System.out.println(product);
//        }

//        System.out.println("using the custom iterator");
//
//        for (Iterator<Product> iter = shoppingCart.getIterator(20.0); iter.hasNext(); ) {
//            Product product = iter.next();
//            System.out.println(product);
//        }

        //endregion

        //region ProductFactory
//        ProductFactory productFactory = new ProductFactory();
//        Product surfboardProduct = productFactory.createProduct("Surfboard");
//        surfboardProduct.withDescription("A nice funboard").withName("O'laian").withPrice(399.99);
//        //this has to happen because of compile  time. The Product has to be cast to the correct Object (Surfboard).
//        Surfboard surfboard = (Surfboard) surfboardProduct;
//        surfboard.setType("Egg");
//        surfboard.setLength(9);
//        System.out.println(surfboardProduct);
//        Product bicycle = productFactory.createProduct("Bicycle");
//        bicycle.withName("Stromer").withDescription("Fancy E-bike").withPrice(99999.9);
//        System.out.println(bicycle);
//        Product ball = productFactory.createProduct("Ball");
//        ball.withPrice(9.99).withDescription("A fancy Football").withName("Nike");
//        System.out.println(ball);
//        Product skateboard = productFactory.createProduct("Skateboard");
//        skateboard.withName("Fox").withDescription("Fancy Longboard").withPrice(299.9);
//        System.out.println(skateboard);
        //endregion

        //region Command Structure
//        Product product = new Ball().withName("Nike Football").withDescription("A round, expensive Football").withPrice(99);
//        BuyProduct buyProduct = new BuyProduct(product);
//        SellProduct sellProduct = new SellProduct(product);
//
//        ShoppingCart shoppingCart = ShoppingCart.getInstance();
//        shoppingCart.addOrder(buyProduct);
//        shoppingCart.addOrder(buyProduct);
//        shoppingCart.addOrder(buyProduct);
//        shoppingCart.addOrder(sellProduct);
//        shoppingCart.placeOrders();
//
//        product.getAmount();

        //endregion

        //region Filter pattern
        // create filterchaining

        AbstractFilter stringFilter = new ContainsSpaceFilter();
        AbstractFilter capitalLetterFilter = new BeginsWithCapitalLetterFilter();
        AbstractFilter expensiveFilter = new IsExpensiveFilter();

        stringFilter.setNextFilter(capitalLetterFilter);
        capitalLetterFilter.setNextFilter(expensiveFilter);


        //runs the filter checks and updates the objects in the array with the updated version.
        System.out.println("Printing the objects BEFORE updating them according to the filter checks.");
        System.out.println("After the filter runs through it, replace them.");
        for (int index = 0; index < products.size(); index++) {
            System.out.println(products.get(index));
            products.set(index, stringFilter.checkFilter(products.get(index)));
            System.out.println();
        }


        System.out.println("printing the updated Objects from the same list.\n");
        for (Product product : products) {
            System.out.println(product);
            System.out.println();
        }

        //endregion

    }
}
