package ThemePark;

import sun.security.krb5.internal.Ticket;

public class Visitor implements ITicketed {
    private int age;
    private Double height;
    private Double money;

    public Visitor(int age, double height, double money){
        this.age = age;
        this.height = height;
        this.money = money;

    }

    public int getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Double getMoney() {
        return money;
    }

    public Double price(Ticket ticket) {
        return ticket.getPrice;
    }
}
