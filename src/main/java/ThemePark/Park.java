package ThemePark;

public class Park extends Attraction implements IReviewed {

    private double price;

    public Park(String name, double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    public
    Integer rating(Integer rating) {
        return null;
    }


    public
    String review(String review) {
        return null;
    }
}
