package homeWork_lesson14.task8;

public class MinMax<T> {
    private T[] array;

    public MinMax(T array) {
    }

    public MinMax(MinMax<?>[] gens) {
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void show(){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

}
