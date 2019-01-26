package homeWork_lesson16.task5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.println("Input 5 numbers");
        for (int i = 0; i < 5; i++) {
            set.add(sc.nextInt());
        }
        for (Integer a : set) {
            System.out.print(a + " ");
        }
    }
}