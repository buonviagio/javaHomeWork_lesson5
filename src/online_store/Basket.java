package online_store;

import java.time.LocalDate;
import java.util.Arrays;

public class Basket {
    private Goods[] purchasedFoods;

    public Basket(Goods[] purchasedFoods) {
        this.purchasedFoods = purchasedFoods;
    }

    public Basket() {
    }

    public Goods[] getPurchasedFoods() {
        return purchasedFoods;
    }

    public void setPurchasedFoods(Goods[] purchasedFoods) {
        this.purchasedFoods = purchasedFoods;
    }

    public double returnPrise() {
        int summ = 0;
        for (Goods a : purchasedFoods) {
            summ += a.getPrice();
        }
        return summ;
    }

    public void returnRating() {
        for (Goods b : purchasedFoods) {
            System.out.println("Вы выбрали " + b.getName() + " с рейтенгом " + b.getRating());
        }
    }

    public void getDate() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int dayMonth = today.getDayOfMonth();
        System.out.println("Вы приобрели товар: " + dayMonth + ":" + month + ":" + year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Arrays.equals(purchasedFoods, basket.purchasedFoods);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(purchasedFoods);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "purchasedFoods=" + Arrays.toString(purchasedFoods) +
                '}';
    }
}
