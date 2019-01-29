package online_store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Category {
    private String name;
    private List<Goods> arrayGoods;

    public Category(String name, List<Goods> arrayGoods) {
        this.name = name;
        this.arrayGoods = arrayGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Goods> getArrayGoods() {
        return arrayGoods;
    }

    public void setArrayGoods(List<Goods> arrayGoods) {
        this.arrayGoods = arrayGoods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Objects.equals(arrayGoods, category.arrayGoods);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, arrayGoods);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", arrayGoods=" + arrayGoods +
                '}';
    }
}
