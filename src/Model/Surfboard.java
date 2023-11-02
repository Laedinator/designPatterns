package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * defines the surfboard
 **/
public class Surfboard extends Product {
    private String type;
    private int length;

    public Surfboard() {
    }

    public Surfboard setType(String type) {
        this.type = type;
        return this;
    }

    public Surfboard setLength(int length) {
        this.length = length;
        return this;
    }

    @Override
    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }
}
