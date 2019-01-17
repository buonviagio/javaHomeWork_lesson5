package homeWork_lesson14.task8;

public class MinMaxDemo {
    public static void main(String[] args) {
        Integer [] array = {1, 6, 8, 4, 9, 5};
        MinMax<?>[] gens = new MinMax<?>[6];
        MinMax<Integer> obj= new MinMax<Integer>(gens);
        obj.show();
    }
}
