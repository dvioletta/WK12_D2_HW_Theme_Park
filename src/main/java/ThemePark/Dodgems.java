package ThemePark;

public
class Dodgems extends Attraction{

    private double price;


    public Dodgems(String name, double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {

        return price;
    }
}
