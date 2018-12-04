package homeWork_lesson5;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        int abc[][] = {
                {5, 7, 3, 9, 6, 2, 1, 8},
                {17, 14, 19, 12, 10, 13, 11, 16},
                {25, 87, 41, 98, 73, 40, 29, 69},
                {1000, 5000, 10000, 2000, 4000, 6000, 8000, 7000},
                {345, 657, 897, 659, 432, 149, 647, 482},
        };
        int[][] result = new int[5][2];
        System.out.println("Массив в изначальном состоянии");
        System.out.println(Arrays.deepToString(abc));

        sort(abc);
        System.out.println("Массив отсортирован");
        System.out.println(Arrays.deepToString(abc));

        System.out.println("Минимальные и максимальные значения массива");
        for (int i = 0; i < abc.length; i++) {
            result[i][0] = abc[i][0];
        }

        int a = 0;
        for (int i = 0; i < abc.length; i++) {
            result[i][1] = abc[i][abc[a].length - 1];
        }
        System.out.println(Arrays.deepToString(result));
    }

    public static void sort(int[][] array) {
        for (int a = 0; a < array.length; a++) {
            for (int i = 0; i < array[0].length; i++) {
                for (int j = array[0].length - 1; j > i; j--) {
                    if (array[a][j - 1] > array[a][j]) {
                        int tmp = array[a][j - 1];
                        array[a][j - 1] = array[a][j];
                        array[a][j] = tmp;
                    }
                }
            }
        }
    }
}