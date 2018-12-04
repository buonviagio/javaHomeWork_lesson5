package homeWork_lesson5;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
        testInvert(new int[]{9, 8, 7, 6, 5, 4});
        testInvert(new int[]{12, 8, 53, 18, 3, 98, 0});
    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        invert(array);
        System.out.println(Arrays.toString(array));
    }

    public static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
}
