package online_store;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Basket {
    private List<Goods> purchasedFoods;
    private int currentIndex;

    public Basket(List<Goods> purchasedFoods) {
        this.purchasedFoods = purchasedFoods;
    }

    public Basket() {
    }

    public List<Goods> getPurchasedFoods() {
        return purchasedFoods;
    }

    public void setPurchasedFoods(List<Goods> purchasedFoods) {
        this.purchasedFoods = purchasedFoods;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public void addGood(Goods good) {
        currentIndex = 1;
        purchasedFoods.add(currentIndex++, good);
    }

    public void printGoods() {
        for (int i = 0; i <= currentIndex; i++) {
            System.out.println(purchasedFoods.get(i));
        }
    }

    public double returnPrise() {
        int summ = 0;
        for (int i = 0; i < currentIndex; i++) {
            summ += purchasedFoods.get(i).getPrice();
        }
        return summ;
    }

    public void returnRating() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("Вы выбрали " + purchasedFoods.get(i).getName() + " с рейтенгом "
                    + purchasedFoods.get(i).getRating());
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
        return currentIndex == basket.currentIndex &&
                Objects.equals(purchasedFoods, basket.purchasedFoods);
    }

    @Override
    public int hashCode() {

        return Objects.hash(purchasedFoods, currentIndex);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "purchasedFoods=" + purchasedFoods +
                ", currentIndex=" + currentIndex +
                '}';
    }
}
