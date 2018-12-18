package online_store;

public class Category {
    private String name;
    private Goods[] arrayGoods;

    public Category(String name, Goods[] arrayGoods) {
        this.name = name;
        this.arrayGoods = arrayGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Goods[] getArrayGoods() {
        return arrayGoods;
    }

    public void setArrayGoods(Goods[] arrayGoods) {
        this.arrayGoods = arrayGoods;
    }
}
