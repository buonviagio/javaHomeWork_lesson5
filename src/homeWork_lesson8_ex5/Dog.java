package homeWork_lesson8_ex5;

public class Dog extends Animal {
    String dogBarking;

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, String dogBarking) {
        super(food, location);
        this.dogBarking = dogBarking;
    }

    void makeNoise() {
        System.out.println(" собака живатное спит. ");
    }

    void eat() {
        System.out.println(" собака ест ");
    }

    void sleep() {
        System.out.println();
    }
}
