package homeWork_lesson8_ex5;

public class AnimalDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("meat", "house in the village");
        Cat cat = new Cat("fish", "apartment");
        Horse horse = new Horse("corn", "hangar");
        Veterinarian vet1 = new Veterinarian();

        Animal animal[] = {dog, cat, horse};
        for (int i = 0; i < animal.length; i++) {
            vet1.treatAnimal(animal[i]);
        }
    }
}
