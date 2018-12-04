package homeWork_lesson5;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        int abc[] = {1, 7, 5, 2, 1};
        sort(abc);
        System.out.println(Arrays.toString(abc));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            boolean a = false;
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                    a = true;
                }
            }
            if (a == true) {
                array[pos] = array[i];
                array[i] = min;    // меняем местами наименьший с array[i]
            }
        }
    }
}
