package online_store;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Arrays.equals(arrayGoods, category.arrayGoods);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(arrayGoods);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", arrayGoods=" + Arrays.toString(arrayGoods) +
                '}';
    }
}
