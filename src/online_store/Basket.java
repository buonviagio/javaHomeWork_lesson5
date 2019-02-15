package online_store;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Basket implements Serializable {
    private List<Goods> purchasedFoods = new ArrayList<>();

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


    public void addGood(Goods good) {
        this.purchasedFoods.add(good);
    }

    public void printGoods() {
        for (int i = 0; i < purchasedFoods.size(); i++) {
            System.out.println(purchasedFoods.get(i).getName() + " " + purchasedFoods.get(i).getPrice() );
        }
    }

    public double returnPrise() {
        int summ = 0;
        for (int i = 0; i < purchasedFoods.size(); i++) {
            summ += purchasedFoods.get(i).getPrice();
        }
        return summ;
    }

    public void returnRating() {
        for (int i = 0; i < purchasedFoods.size(); i++) {
            System.out.println("Вы выбрали " + purchasedFoods.get(i).getName() + " с рейтенгом "
                    + purchasedFoods.get(i).getRating());
        }
    }

    public String returnNameOfProducts() {
        for (int i = 0; i < purchasedFoods.size(); i++) {
            return purchasedFoods.get(i).getName();
        }
        return null;
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
        return Objects.equals(purchasedFoods, basket.purchasedFoods);
    }

    @Override
    public int hashCode() {

        return Objects.hash(purchasedFoods);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "purchasedFoods=" + purchasedFoods +
                '}';
    }
}
