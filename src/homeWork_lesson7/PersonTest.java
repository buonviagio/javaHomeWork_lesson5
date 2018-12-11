package homeWork_lesson7;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Сергей", 33);

        person1.talk();
        person2.talk();
    }
}
