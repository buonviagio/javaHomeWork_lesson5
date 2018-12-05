package homeWork_lesson5;

public class Task18 {
    public static void main(String[] args) {
        int abc[] = {1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0};

        System.out.println("Метод выясняющий, включена ли \nлампочка на первой позиции");
        System.out.println();
        check(abc);
        System.out.println();

        System.out.println("Метод показывающий состояние гирлянды");
        show(abc);
        System.out.println("\n");

        System.out.println("Метод мигающий лампочки");
        show(abc);
        System.out.println();
        for (int j = 0; j < 5; j++) {
            blinc1(abc);
            System.out.println();
        }

        System.out.println("\n\nМетод, который запускает гирлянду \nв режиме бегушей строки.");
        for (int i = 0; i < 5; i++) {
            System.arraycopy(abc, 1, abc, 0, 31);
            show(abc);
            System.out.println();
        }
    }

    private static void show(int array[]) {
        for (int a : array) {
            System.out.print(a);
        }
    }

    private static void blinc1(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
                System.out.print(array[i]);
            } else {
                array[i] = 0;
                System.out.print(array[i]);
            }
        }
    }

    private static void check(int array[]) {
        if (array[array.length - 1] == 1) {
            System.out.println("Лампочка на первой позиции ВКЛЮЧЕНА");
        } else {
            System.out.println("Лампочка на первой позиции ВЫКЛЮЧЕНА");
        }

    }
}

