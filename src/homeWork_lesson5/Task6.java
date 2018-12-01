package homeWork_lesson5;

public class Task6 {
    public static void main(String[] args) {
        int a = 1;
        do {
            if (a % 5 == 0) {
                System.out.println("Это число делится на 5 без остатка " + a);
            }
            a++;
        } while (a <= 100);
    }
}
