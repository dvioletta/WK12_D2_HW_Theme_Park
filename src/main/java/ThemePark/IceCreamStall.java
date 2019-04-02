package ThemePark;

public
class IceCreamStall extends Stall implements IReviewed {


    public
    IceCreamStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public
    Integer rating(Integer rating) {
        return null;
    }

    @Override
    public
    String review(String review) {
        return null;
    }
}




