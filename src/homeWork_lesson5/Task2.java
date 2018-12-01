package homeWork_lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("Вы ввели не число");
        }
        if (a >= 0 && a <= 10) {
            System.out.println("Вы ввели число в диапазоне от 0 до 10");
        } else {
            System.out.println("Вы ввели число большее 10 или с отрицательным значением");
        }
    }
}
