package homeWork_lesson15;

public class Food {
    public void prepare(Cookable c) {
        c.cook();
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Override method 1");
            }
        });

        Cookable cookable = () -> System.out.println("Override method 2");
        cookable.cook();
    }
}
