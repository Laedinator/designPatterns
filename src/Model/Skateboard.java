package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * defines the Skateboard
 **/
public class Skateboard extends Product {
    private String type;
    private String color;

    public Skateboard() {
    }

    @Override
    public String getType() {
        return type;
    }

    public Skateboard setType(String type) {
        this.type = type;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Skateboard setColor(String color) {
        this.color = color;
        return this;
    }
}
