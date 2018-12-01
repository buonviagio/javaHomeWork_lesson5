package homeWork_lesson5;

public class Task3 {
    public static void main(String[] args) {
        String a = args[0];
        int b = Integer.parseInt(a);

        if (b == 1) {
            System.out.println("Понедельник");
        } else if (b == 2) {
            System.out.println("Вторник");
        } else if (b == 3) {
            System.out.println("Среда");
        } else if (b == 4) {
            System.out.println("Четверг");
        } else if (b == 5) {
            System.out.println("Пятница");
        } else {
            System.out.println("Выходной");
        }
    }
}
