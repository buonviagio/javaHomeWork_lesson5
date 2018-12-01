package homeWork_lesson5;

public class Task15 {
    public static void main(String[] args) {
        int[] abc = {3, 5, 1, 2};
        for (int b : abc) {
            System.out.print(b);
        }
        System.out.println();
        sort(abc);
        for (int a : abc) {
            System.out.print(a);
        }
    }

    public static void sort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
