package homeWork_lesson16.task10;

import java.util.Objects;

public class Student {
    private String name;
    private int course, group, mark;

    public Student(String name, int course, int group, int mark) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group &&
                mark == student.mark &&
                Objects.equals(name, student.name) &&
                Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, course, group, mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", group=" + group +
                ", mark=" + mark +
                '}';
    }
}
