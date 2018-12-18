package homeWork_lesson9.task5;

public class CircleDemo {
    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(8.5);
        Circle circle3 = new Circle(16);
        Circle circle4 = new Circle(5.5);

        Circle[] circles = {circle1, circle2, circle3, circle4};

        for (Circle array : circles) {
            array.areaOfCircle();
            array.circleLength();
            System.out.println();
        }
    }
}
