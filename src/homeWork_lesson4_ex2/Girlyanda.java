package homeWork_lesson4_ex2;

public class Girlyanda {
    public static void main(String[] args) {
        int a = 1_197_323_576;

        System.out.println("Метод, который мигает лампочками.");
        blinc(a);
        System.out.println();

        System.out.println("Метод, который запускает гирлянду \nв режиме бегушей строки.");
        runningString(a);
        System.out.println();

        int z = 1_765_987_755;
        System.out.println("Метод выясняющий, включена ли \nлампочка на первой позиции");
        System.out.println(" ");
        check(a);
        System.out.println();

        System.out.println("Метод, показывающтй текущее \nсостояние гирлянды.");
        show(a);
    }

    private static void show(int a) {
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
    }

    private static void check(int a) {
        int d = a&1;
        if (d == 1) {
            System.out.println("Лампочка на первой позиции ВКЛЮЧЕНА");
        } else {
            System.out.println("Лампочка на первой позиции ВЫКЛЮЧЕНА");
        }
        System.out.println(String.format("%32s", Integer.toBinaryString(d)).replace(' ', '0'));
    }

    private static void runningString(int a) {
        int c = a<<1;
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(c)).replace(' ', '0'));
        for (int i = 1; i < 10; i++) {
            System.out.println(String.format("%32s", Integer.toBinaryString(a<<i)).replace(' ', '0'));
        }
    }

    private static void blinc(int a) {
        int b = ~a;
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        for(int i = 1; i <10; i++){
            if(i%2==0){
                System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
            } else {
                System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
            }
        }
    }
}
