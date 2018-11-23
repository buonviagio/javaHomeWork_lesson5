package homeWork_lesson4_ex1;

import java.util.Scanner;

public class Modul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите три числа");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a <= b & a <= c ? "наименьшее число " + a : b <= a & b <= c ? "наименьшее число " + b : "наименьшее число " + c);
    }
}
