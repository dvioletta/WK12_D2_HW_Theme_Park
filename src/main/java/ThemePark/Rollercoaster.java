package ThemePark;

public
class Rollercoaster extends Attraction {
    private double price;

    public Rollercoaster(String name, double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
