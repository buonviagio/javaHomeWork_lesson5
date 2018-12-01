package homeWork_lesson5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int a = 1_197_323_576;

        Scanner sc = new Scanner(System.in);
        int e = 3;
        System.out.println("Введите число от 1 до 4");
        if (sc.hasNextInt() && e > 0 && e < 5) {
            e = sc.nextInt();
        } else {
            System.out.println("Вы ввели не число или число не из диапазона 1 - 4");
        }

        switch (e) {
            case 1:
                System.out.println("Метод, показывающтй текущее \nсостояние гирлянды.");
                show(a);
                break;
            case 2:
                System.out.println("Метод, который мигает лампочками.");
                blinc(a);
                break;
            case 3:
                System.out.println("Метод, который запускает гирлянду \nв режиме бегушей строки.");
                runningString(a);
                break;
            case 4:
                System.out.println("Метод выясняющий, включена ли \nлампочка на первой позиции");
                System.out.println(" ");
                check(a);
                break;
        }
    }

    private static void check(int a) {
        int d = a & 1;
        if (d == 1) {
            System.out.println("Лампочка на первой позиции ВКЛЮЧЕНА");
        } else {
            System.out.println("Лампочка на первой позиции ВЫКЛЮЧЕНА");
        }
    }

    private static void runningString(int a) {
        int c = a << 1;
        show(c);
        for (int i = 1; i < 10; i++) {
            show(a << i);
        }
    }

    private static void blinc(int a) {
        int b = ~a;
        show(b);
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                show(b);
            } else {
                show(a);
            }
        }
    }

    private static void show(int a) {
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
    }
}
