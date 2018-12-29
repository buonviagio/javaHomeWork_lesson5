package homeWork_lesson10.task2;

import java.util.Objects;

public class Drum implements Instrument {
    private double size;

    public Drum(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void play() {
        System.out.println("Играет барабан в тональности: " + TONE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return Double.compare(drum.size, size) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size +
                '}';
    }
}
