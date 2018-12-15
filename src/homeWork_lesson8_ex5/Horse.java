package homeWork_lesson8_ex5;

public class Horse extends Animal{
    String horsesMane;

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, String horsesMane) {
        super(food, location);
        this.horsesMane = horsesMane;
    }

    void makeNoise() {
        System.out.println(" лошадь живатное спит. ");
    }

    void eat(){
        System.out.println(" лошадь ест ");
    }

    void sleep (){
        System.out.println();
    }
}
