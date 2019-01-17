package homeWork_lesson14.task6;

import homeWork_lesson8_ex5.Dog;

import java.io.Serializable;

public class ThreeGen<T extends Comparable, V, K extends Number> {
    T ob1;
    V ob2;
    K ob3;

    public ThreeGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void setOb3(K ob3) {
        this.ob3 = ob3;
    }

    void showTypes(){
        System.out.println("Тип класса T " + ob1.getClass().getName());
        System.out.println("Тип класса V " + ob2.getClass().getName());
        System.out.println("Тип класса K " + ob3.getClass().getName());
    }

    public static void main(String[] args) {
        ThreeGen<String, Dog, Double> threeObj = new ThreeGen<>("Argument", new Dog("AAA", "BBB"), 775.9);
    }
}
