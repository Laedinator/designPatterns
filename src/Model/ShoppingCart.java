package Model;

import java.util.ArrayList;
import java.util.Iterator;
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

    private final List<Order> orderList = new ArrayList<>();


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

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.executeOrder();
        }
        orderList.clear();
    }

    //region customIterator
    public Iterator<Product> getIterator(double priceLimit) {

        return new ProductIterator(priceLimit);
    }

    private class ProductIterator implements Iterator<Product> {

        int index;
        double priceLimit;

        public ProductIterator(double priceLimit) {
            this.priceLimit = priceLimit;
        }

        @Override
        public boolean hasNext() {
            return index < shoppingList.size();
        }

        @Override
        public Product next() {
            double price = shoppingList.get(index).getPrice();

            if (priceLimit > price) {
                return shoppingList.get(index++);
            }
            return next();
        }
    }
    //endregion

}
