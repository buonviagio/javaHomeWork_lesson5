package homeWork_lesson8_ex5;

public class Cat extends Animal {
    String catMeowing;

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat(String food, String location, String catMeowing) {
        super(food, location);
        this.catMeowing = catMeowing;
    }

    void makeNoise() {
        System.out.println(" кошка живатное спит. ");
    }

    void eat() {
        System.out.println(" кошка ест ");
    }

    void sleep() {
        System.out.println();
    }
}
