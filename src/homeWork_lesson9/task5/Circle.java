package homeWork_lesson9.task5;

import java.util.Objects;

public class Circle {
    static final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void areaOfCircle() {
        System.out.println("Площадь круга с радиусом " + radius + " равна: " + radius * radius * PI);
    }

    public void circleLength() {
        System.out.println("Длина окружности с радиусом " + radius + " равна: " + 2 * PI * radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
