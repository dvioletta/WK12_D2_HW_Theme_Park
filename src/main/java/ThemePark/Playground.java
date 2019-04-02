package ThemePark;


public class Playground extends Attraction implements ITicketed {


    public Playground(String name, double price) {
        super(name);
    }

    public void defaultPrice(Double defaultPrice) {
        this.defaultPrice += price;

    }
}
