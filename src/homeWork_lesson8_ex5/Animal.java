package homeWork_lesson8_ex5;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    void makeNoise() {
        System.out.println(" животное живатное спит. ");
    }

    void eat() {
        System.out.println(" животное ест ");
    }

    void sleep() {
        System.out.println();
    }

}
