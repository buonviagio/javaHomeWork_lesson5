package homeWork_lesson16.task11;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {

        Map<String, Pet> map = new TreeMap<>();
        map.put("Cat", new Cat("cat"));
        map.put("Dog", new Dog("dog"));
        map.put("Parrot", new Parrot("parrot"));

        show(map);
    }

    private static void show(Map<String, Pet> map) {
        Set<Map.Entry<String, Pet>> entrySet = map.entrySet();
        for (Map.Entry<String, Pet> entry : entrySet) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
