package homeWork_lesson9.task4;

public class Demo {
    public static void main(String[] args) {

        Apple apple = new Apple(10.0);
        Pear pear = new Pear(12.0);
        Apricot apricot = new Apricot(20.0);

        double sellApple = apple.showPrice() * 8;
        System.out.println("Яблок продано: " + sellApple / apricot.showPrice() + " kg. На сумму: " + sellApple);

        double sellPear = pear.showPrice() * 6;
        System.out.println("Груш продано: " + sellPear / apricot.showPrice() + " kg. На сумму: " + sellPear);

        double sellApricot = apricot.showPrice() * 3;
        System.out.println("Абрикос продано: " + sellApricot / apricot.showPrice() + " kg. На сумму: " + sellApricot);

        double summ = sellApple + sellApricot + sellPear;
        System.out.println("Продано фруктов на: " + summ + " гривен.");
    }
}
