package homeWork_lesson7;

public class Recursion {

    void recursion(int a, int b) {
        if (a<b){
            recurs1(a,b);
        }
        else if (a>b){
            recurs2(a,b);
        }
    }

    void recurs1 (int a, int b){
        if (a < b) {
            System.out.print(a + " ");
            recurs1(a + 1, b);
        }
        else {
            System.out.println(b);
        }
    }

    void recurs2 (int a, int b) {
        if (a > b) {
            System.out.print(a + " ");
            recurs2(a - 1, b);
        }
        else {
            System.out.println(b);
        }
    }
}
