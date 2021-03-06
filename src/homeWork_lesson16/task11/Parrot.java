package homeWork_lesson16.task11;

import java.util.Objects;

public class Parrot extends Pet {
    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    public Parrot(String name, String name1) {
        super(name);
        this.name = name1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(name, parrot.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                "} ";
    }
}
