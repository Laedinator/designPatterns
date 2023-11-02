package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * creates Products with an input string.
 **/
public class ProductFactory {

    public Product createProduct(String type) {

        switch (type) {
            case "Ball":
                return new Ball();
            case "Surfboard":
                return new Surfboard();
            case "Bicycle":
                return new Bicycle();
            case "Skateboard":
                return new Skateboard();
        }
        return null;
    }

}
