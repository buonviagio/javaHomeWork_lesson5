package homeWork_lesson9.lesson8_task4;

import java.util.Objects;

public class Tulips extends Flower{
    private static int count = 0;
    private String color;

    public Tulips(String countryOfOrigin, String expirationDate, double price, String color) {
        super(countryOfOrigin, expirationDate, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Tulips.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tulips tulips = (Tulips) o;
        return Objects.equals(color, tulips.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Tulips{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
