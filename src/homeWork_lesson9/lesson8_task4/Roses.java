package homeWork_lesson9.lesson8_task4;

import java.util.Objects;

public class Roses extends Flower {
    private static int count = 0;
    private String color;

    public Roses(String countryOfOrigin, String expirationDate, double price, String color) {
        super(countryOfOrigin, expirationDate, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void setCount(int count) {
        Roses.count = count;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Roses roses = (Roses) o;
        return Objects.equals(color, roses.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Roses{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
