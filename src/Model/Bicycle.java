package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * Defines the bycicle.
 **/
public class Bicycle extends Product {
    private String type;
    private Character size;

    public Bicycle() {
    }

    @Override
    public String getType() {
        return type;
    }

    public Bicycle setType(String type) {
        this.type = type;
        return this;
    }

    public Character getSize() {
        return size;
    }

    public Bicycle setSize(Character size) {
        this.size = size;
        return this;
    }
}
