package homeWork_lesson5;

public class Task9 {
    public static void main(String[] args) {
        double a = Math.random() * 8;
        int b = (int) a;
        int factorial = 1;
        System.out.println("Случайно сгенерированное число " + b);

        if (b == 0) {
            System.out.println("Факториал число 0, это 1");
        } else {
            for (int i = 1; i <= b; i++) {
                factorial *= i;
            }
            System.out.println("Факториал числа " + factorial);
        }
    }
}
