package homeWork_lesson9.lesson8_task4;

import java.util.Objects;

public class Flower {
    private String countryOfOrigin;
    private String expirationDate;
    private double price;

    public Flower(String countryOfOrigin, String expirationDate, double price) {
        this.countryOfOrigin = countryOfOrigin;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.price, price) == 0 &&
                Objects.equals(countryOfOrigin, flower.countryOfOrigin) &&
                Objects.equals(expirationDate, flower.expirationDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countryOfOrigin, expirationDate, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "countryOfOrigin='" + countryOfOrigin + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", price=" + price +
                '}';
    }
}
