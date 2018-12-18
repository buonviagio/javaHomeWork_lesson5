package homeWork_lesson9.task4;

import java.util.Objects;

public class Apricot extends Fruit {
    private double price;

    public Apricot(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public Apricot(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double showPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apricot apricot = (Apricot) o;
        return Double.compare(apricot.price, price) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), price);
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "price=" + price +
                "} " + super.toString();
    }
}
