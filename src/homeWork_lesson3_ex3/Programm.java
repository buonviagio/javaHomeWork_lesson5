package homeWork_lesson3_ex3;

import java.util.Scanner;

public class Programm {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Введите число: ");

            if (sc.hasNextInt()){
                int i = sc.nextInt();
                if (i%2 == 0) {
                    System.out.println("Вы ввели четное число");
                }
                else {
                    System.out.println("Вы ввели не четное число");
                }
            }
            else {
                System.out.println("Вы ввели не число");
            }
        }
    }


