import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    private int avgGrade;
    private String name;

    public Student(int avgGrade, String name) {
        this.avgGrade = avgGrade;
        this.name = name;

    }

    @Override
    public int compareTo(Student o) {
        return this.getAvgGrade() - o.getAvgGrade();
    }

    public int getAvgGrade() {
        return avgGrade;
    }


    public String toString() {
        return  this.name +" "+ this.avgGrade;
    }

}
class Stud {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student st1 = new Student(8, "Arkadiy");
        Student st2 = new Student(5, "Semen");
        Student st3 = new Student(3, "Stas");
        students.add(st1);
        students.add(st2);
        students.add(st3);

        Collections.sort(students);
        System.out.println(students);
    }
}
