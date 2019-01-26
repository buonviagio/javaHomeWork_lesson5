package homeWork_lesson16.task10;

import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();

        student.add(new Student("Ivanov", 10, 3, 4));
        student.add(new Student("Petrov", 10, 6, 3));
        student.add(new Student("Vasichkin", 8, 4, 5));
        student.add(new Student("Sergeev", 8, 8, 2));
        student.add(new Student("Sidorov", 10, 2, 1));

        System.out.println(student);

        studentSort(student);
        System.out.println(student);

        printStudents(student, 8);
    }

    private static void studentSort(List<Student> student) {
        student.removeIf(stud -> stud.getMark() < 3);
    }

    private static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student stud = iterator.next();
            if (stud.getCourse() == course)
                System.out.println(stud);
        }

    }
}