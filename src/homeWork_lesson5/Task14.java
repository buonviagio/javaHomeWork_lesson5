package homeWork_lesson5;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
      //testInvert(new int[]{});
      //testInvert(new int[]{0});
      //testInvert(new int[]{0, 1});
      //testInvert(new int[]{0, 1, 2, 3, 4});
        testInvert(new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20});
    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        invert(array);
        System.out.println(Arrays.toString(array));
    }

    public static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}
