package homeWork_lesson5;

public class Task12 {
    public static void main(String[] args) {
        String abc[][] = new String[3][6];

        for (int i = 0; i < abc.length; i++) {
            int z = 1;
            char symbol = 'a';
            for (int j = 0; j < abc[0].length; j++) {
                abc[i][j] = " " + z++;
                System.out.print(abc[i][j] + symbol++);
            }
            System.out.println();
        }
    }
}