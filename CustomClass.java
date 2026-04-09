import java.util.*;

public class CustomClass {

    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {

        Student s1 = new Student(85);
        Student s2 = new Student(78);

        Student top = max(s1, s2);

        System.out.println("Top marks: " + top.marks);
    }
}

class Student implements Comparable<Student> {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }
}