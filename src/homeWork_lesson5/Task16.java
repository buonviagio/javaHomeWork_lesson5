package homeWork_lesson5;

public class Task16 {
    public static void main(String[] args) {
        int[] abc = {3, 5, 1, 0, 9, 6, 7};
        for (int b : abc){
            System.out.print(b + " ");
        }
        System.out.println();
        sort(abc);
        for (int a : abc) {
            System.out.print(a + " ");
        }
    }

    public static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
