package online_store;

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
        for (Goods a : purchasedFoods) {
            return a.getPrice();
        }
        return 0;
    }

    public void returnRating(){
        for (Goods b : purchasedFoods) {
            System.out.println("Вы выбрали " + b.getName() + " с рейтенгом " + b.getRating());
        }
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
