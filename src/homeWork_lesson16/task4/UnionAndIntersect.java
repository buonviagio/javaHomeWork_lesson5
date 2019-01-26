package homeWork_lesson16.task4;

import java.util.*;

public class UnionAndIntersect {
    public static void main(String[] args) {
        Set<String> arrayList1 = new LinkedHashSet<>();
        Set<String> arrayList2 = new LinkedHashSet<>();

        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("E");
        arrayList1.add("F");

        arrayList2.add("A");
        arrayList2.add("B");
        arrayList2.add("D");
        arrayList2.add("W");
        arrayList2.add("Y");

        union(arrayList1, arrayList2);

        intersect(arrayList1, arrayList2);
    }

    public static void union(Set<String>... set) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < set.length; i++) {
            result.addAll(set[i]);
        }
        System.out.println(result);
    }

    public static void intersect(Set<?> array1, Set<?> array2) {
        array1.retainAll(array2);
        System.out.println(array1);

    }
}
