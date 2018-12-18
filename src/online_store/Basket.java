package online_store;

public class Basket {
    private Goods [] purchasedFoods;

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
}
