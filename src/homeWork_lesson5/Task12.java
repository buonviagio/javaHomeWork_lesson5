package homeWork_lesson5;

public class Task12 {
    public static void main(String[] args) {
        String abc[][] = {
                {"a1 ", "a2 ", "a3 ", "a4 ", "a5 ", "a6 "},
                {"b1 ", "b2 ", "b3 ", "b4 ", "b5 ", "b6 "},
                {"c1 ", "c2 ", "c3 ", "c4 ", "c5 ", "c6 "}
        };
        int z = 1;

        for (int i = 0; i < abc.length; i++) {
            if (i == 0) {

            } else {
                System.out.println();
            }
            for (int j = 0; j < 6; j++) {
                System.out.print(abc[i][j]);
            }
        }
    }
}
