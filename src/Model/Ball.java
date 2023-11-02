package Model;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 * defines the Ball
 **/
public class Ball extends Product {
    private String type = "";
    private int diameter;

    public Ball() {
    }

    public Ball withType(String type) {
        this.type = type;
        return this;
    }

    public Ball withDiameter(int diameter) {
        this.diameter = diameter;
        return this;
    }

    @Override
    public String getType() {
        return type;
    }

    public int getDiameter() {
        return diameter;
    }

}
