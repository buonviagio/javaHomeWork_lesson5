package homeWork_lesson5;

public class Task16 {
    public static void main(String[] args) {
        int[] abc = {9, 8, 3, 4, 78, 5, 43, 8, 0, 55, 2, 9, 3, 1, 99, 5, 100};
        for (int b : abc) {
            System.out.print(b + " ");
        }
        System.out.println();
        sort(abc);
        for (int a : abc) {
            System.out.print(a + " ");
        }
    }

    public static void sort(int[] array) {
        int a = 0;
        for (int i = array.length - 1; i > 0; i--) {
            a++;
            boolean stop = false;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    stop = true;
                }
            }
            if (stop == false) {
                System.out.println("Сортировка закоечена досрочно, на " + a + " итерации внешнего цикла.");
                break;
            }
        }
    }
}
