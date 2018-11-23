package homeWork_lesson3_ex4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа: ");

        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            int y = sc.nextInt();
            sum(i, y);
        } else {
            System.out.println("Вы ввели не числа");
        }

    }

    public static void sum(int i, int y) {
        System.out.println(i + y);
    }
}
